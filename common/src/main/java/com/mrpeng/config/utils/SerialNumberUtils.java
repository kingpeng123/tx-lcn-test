package com.mrpeng.config.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 流水号生成工具
 * @author: pqq
 * @create: 2021-01-06 08:11
 **/
@Component
public class SerialNumberUtils {
    @Autowired
    private RedisCache redisCache;

    /**
     * 获取流水号
     * @param type
     * @return
     */
    @Deprecated
    public String getSerialNumber(String type){
        String serial;
        synchronized (Object.class){
            Integer serialDate;
            Integer serialNumber;
            LocalDate nowDate =LocalDate.now();
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyMMdd");
            serialDate= Integer.parseInt(nowDate.format(formatter));
            Object preSerialDate =redisCache.getCacheObject(type);
            Object preSerialNumber = redisCache.getCacheObject("serialNumber");
            serialNumber =(Integer) preSerialNumber;
            if(preSerialDate == null){
                preSerialDate =serialDate;
            }
            if(preSerialNumber ==null || preSerialNumber.equals(0)){
                serialNumber =0;
            }
            if(preSerialDate.equals(serialDate)){
                serialNumber++;
            }else{
                serialNumber =1;
            }
            String serialNumberString="";
            switch (serialNumber.toString().length()){
                case 1 : serialNumberString="00"+serialNumber;break;
                case 2 : serialNumberString="0"+serialNumber;break;
                case 3 : serialNumberString=""+serialNumber;break;
            }
            if(serialNumber>999){
                throw new RuntimeException("流水号超过1000");
            }
             serial =type+"-"+serialDate+serialNumberString;

        }
        return serial;
    }

    /**
     * 根据单据类型，返回流水号
     * @param type
     * @return
     */
    @Deprecated
    public Map<String,Object> getSerialNumberByType(String type){
        Map<String,Object> result =new HashMap<>();
        synchronized (Object.class){
            Integer serialDate;
            LocalDate nowDate =LocalDate.now();
            DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyMMdd");
            serialDate= Integer.parseInt(nowDate.format(formatter));
            Map<String, Integer> info = redisCache.getCacheMap(type);
//            System.out.println(info.get("preSerialDate"));
//            System.out.println(info.get("preNumber"));
            if(info ==null || info.size()==0){
                info.put("preSerialDate",serialDate);
                info.put("preNumber",0);
            }
            //上一次的编号时间
            Integer preSerialDate = info.get("preSerialDate");
            //上一次的流水号
            Integer preNumber = info.get("preNumber");
            Integer number =preNumber;
            if(!preSerialDate.equals(serialDate)){
                number=0;
            }
            number++;
            if(number>9999){
                throw new RuntimeException("流水号达到最大值！！");
            }

            String serialNumber=type+"-"+serialDate.toString();
            switch (number.toString().length()){
                case 1 : serialNumber+="000"+number;break;
                case 2 : serialNumber+="00"+number;break;
                case 3 : serialNumber+="0"+number;break;
                case 4 : serialNumber+=""+number;break;
            }
            Map<String,Integer> preSerialNumber = new HashMap<>();
            //将本次得到的流水作为上一次的流水，放入缓存
            preSerialNumber.put("preSerialDate",serialDate);
            preSerialNumber.put("preNumber",number);

            result.put("serialNumber",serialNumber);
            result.put("preSerialNumber",preSerialNumber);
        }
        return result;
    }

    /**
     * 生成流水号
     * @param type 单据类型
     * @return
     */
    public String generateSerialNumber(String type){
        StringBuilder serialNumber =new StringBuilder(type+"-");
        synchronized (Object.class){
            String today = DateUtils.getNowDate(DateUtils.DATE_YY_MM_DD);
            StringBuilder key =new StringBuilder(today);
            key.append(type);
            Long increment = redisCache.increment(key.toString());
            if(increment.equals(1L)){
                redisCache.expire(key.toString(), 1L, TimeUnit.DAYS);
            }
            String incrementStr = increment.toString();
            while (incrementStr.length() < 4){
                incrementStr = "0"+incrementStr;
            }
            serialNumber.append(today).append(incrementStr);
        }
        return serialNumber.toString();
    }





}