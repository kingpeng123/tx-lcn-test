package com.mrpeng.config.utils;

import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间帮助类
 */
public class DateUtils {

    public static final String DATE_SS = "HH:mm:ss";
    public static final String DATE_HH_MM = "HH:mm";
    public static final String DATE_HH = "HH";
    public static final String DATE_YYYY_MM_dd_HH = "yyyy-MM-dd HH";
    public static final String DATE_MM_dd_HH_MM = "yyyy-MM-dd HH:mm";
    public static final String DATE_YEAR_SS = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_YEAR_MM = "yyyy-MM-dd HH-mm-ss";
    public static final String DATE_DD = "yyyy-MM-dd";
    public static final String DATE_YY_MM_DD ="yyMMdd";
    public static final String DATE_YYYMMDD = "yyyyMMdd";
    public static final String DATE_YMDHMSS = "yyyy-MM-dd HH:mm:ss:SS";
    public static final String Date_Y_M_D_H_M_S = "yyyyMMddHHmmssSS";



    public static void main(String[] args) throws ParseException {
        Date time = Calendar.getInstance().getTime();
        Date dateByType = getDateByType(DateUtils.DATE_DD, time);
        System.out.println(getDateToString(dateByType));
    }

    /**
     * 获取字符串当前时间
     * @return 返回时间的格式：yyyy-MM-dd HH:mm:ss
     */
    public static String getNowDate(){
        Date date =new Date();
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat(DateUtils.DATE_YEAR_SS);
        String format = simpleDateFormat.format(date);
        return format;
    }

    /**
     * 根据时间类型  获取今天时间
     * @param type 时间类型
     * @return 返回type类型时间
     */
    public static String getNowDate(String type){
        if(type == null){
            return "";
        }
        Date time = Calendar.getInstance().getTime();
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat(type);
        String format = simpleDateFormat.format(time);
        return format;
    }
    /**
     * 根据type获取针对字符串类型时间的前后时间
     */
    public static String getTimeAdd(String dateString,String dateType,int type,int time){
        if(StringUtils.isEmpty(dateString) || StringUtils.isEmpty(dateType)){
            return null;
        }
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat(dateType);
        Date date=null;
        try {
             date = simpleDateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar =Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(type,time);
        date =calendar.getTime();
        String format = simpleDateFormat.format(date);
        return format;
    }

    /**
     * 将时间转换成时间字符串
     * @param date  转换的时间
     * @return 返回格式1990-01-01 00:00:00
     */
    public static String getDateToString (Date date){
        if(date==null){
            return "";
        }
        DateFormat df =new SimpleDateFormat(DATE_YEAR_SS);
        String format = df.format(date);
        return format;
    }

    /**
     * 将时间转换成时间字符串
     * @param date  转换的时间
     * @return 返回格式 type 自定义格式
     */
    public static String getDateToString (Date date,String type){
        if(date==null){
            return "";
        }
        if(StringUtils.isEmpty(type)){
            return "";
        }
        DateFormat df =new SimpleDateFormat(type);
        String format = df.format(date);
        return format;
    }

    /**
     * 将时间字符串转换成时间类型
     * @param dateString  转换的时间
     * @return 返回格式 type 自定义格式
     */
    public static Date getStringToDate (String dateString){
        if(dateString==null){
            return new Date();
        }
        DateFormat df =new SimpleDateFormat(DATE_YEAR_SS);
        Date format = null;
        try {
            format = df.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return format;
    }



    /**
     * 获取两个时间相差的秒值
     * @param str1 时间参数str1 格式：1990-01-01 00:00:00
     * @param str2 时间参数str2 格式：1990-01-01 00:00:00
     * @return 返回long类型  秒值
     */
    public static Long getDistanceSeconds(String str1,String str2){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date one;
        Date two;
        long seconds=0;
        long diff = 0;
        try {
            one = df.parse(str1);
            two = df.parse(str2);
            long time1 = one.getTime();
            long time2 = two.getTime();

            if(time1<time2) {
                diff = time2 - time1;
            } else {
                diff = time1 - time2;
            }
            if(diff !=0){
                seconds =diff/1000;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return seconds;
    }
    /**
     * 获取两个时间相差的秒值
     * @param str1 时间参数str1
     * @param str2 时间参数str2
     * @return 返回long类型  秒值
     */
    public static long getDistanceSeconds(Date str1,Date str2){
        Date one =str1;
        Date two =str2;
        long seconds=0;
        long diff = 0;
        long time1 = one.getTime();
        long time2 = two.getTime();

        if(time1<time2) {
            diff = time2 - time1;
        } else {
            diff = time1 - time2;
        }
        if(diff !=0){
            seconds =diff/1000;
        }else{
            seconds =0;
        }
        return seconds;
    }

    /**
     * 将数据表中的默认时间转换为null；
     * @param date  默认时间
     * @return
     */
    public static Date defaultDateToNull(Date date){
        if(date == null){
            return null;
        }
        String dateToString = getDateToString(date);
        if(dateToString.equals("9998-12-31 00:00:00")){
            return null;
        }else if(dateToString.equals("1900-01-01 00:00:00")){
            return null;
        }
        return date;
    }

    /**
     * 两个时间相差的时间多少天多少时
     * @param str1 起始时间
     * @param str2 结束时间
     * @return 返回字符串表达式 例如3天2时
     */
    public static String getDistanceTime(String str1,String str2){
        if(StringUtils.isEmpty(str1) || StringUtils.isEmpty(str2)){
            return "0天0时";
        }
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat(DateUtils.DATE_YEAR_SS);
        Calendar calendar1 =Calendar.getInstance();
        Calendar calendar2 =Calendar.getInstance();
        long day =0;
        long hour=0;
        long diff =0;
        try {
            Date date1 = simpleDateFormat.parse(str1);
            Date date2 = simpleDateFormat.parse(str2);
            long time1 =date1.getTime();
            long time2 =date2.getTime();
            if(time1>time2){
                diff =time1 -time2;
            }
            if(time1<time2){
                diff =time2 -time1;
            }
            day =diff/1000/3600/24;
            hour =diff/3600/1000-(day * 24);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return day + "天" + hour + "时";
    }

    /**
     * 根据时间类型  获取时间
     * @param type 例如yyyy-MM-dd
     * @param date  返回时间类型
     * @return
     */
    public static Date getDateByType(String type,Date date){
        if(StringUtils.isEmpty(type)){
            return new Date();
        }
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat(type);
        String format = simpleDateFormat.format(date);
        try {
            date =simpleDateFormat.parse(format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}
