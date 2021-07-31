package com.mrpeng.config.utils;

import lombok.Data;

import java.util.List;

/**
 * @author: pqq
 * @create: 2021-01-15 13:45
 *  自定义List分页方法
 *
 **/
@Data
public class PageUtils<T>{


    public static <T> List<T> startPage(List<T> list,Integer currentPage,Integer pageSize){
        if (list == null) {
            return null;
        }
        if (list.size() == 0) {
            return null;
        }
        if(currentPage <= 0 || currentPage<=0){
            return null;
        }
        if(list.size()==0){
            return null;
        }
        Integer total =list.size();  // 总数量
        Integer pageCount =total % pageSize ==0? total/pageSize: total/pageSize+1; //总页数

        Integer startIndex =0; //开始索引
        Integer endIndex=0;  //结束索引
        if(currentPage > pageCount){
            return null;
        }
        if(currentPage < 1){
            return  null;
        }
        if(currentPage != pageCount){
            startIndex =(currentPage-1)*pageSize;
            endIndex =startIndex+pageSize;
        }else{
            startIndex=(currentPage-1)*pageSize;
            endIndex =total;
        }
        List<T> ts = list.subList(startIndex, endIndex);
        return ts;
    }


}
