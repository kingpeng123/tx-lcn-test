package com.mrpeng.config.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 集合帮助类
 * @author: pqq
 * @create: 2021-03-18 08:29
 **/
public class CollectionUtils {
    /**
     * 判断集合是否为空
     * @param collection
     * @return true 为空 false 不为空
     */
    public static boolean isEmpty(Collection<?> collection){
        return collection ==null || collection.isEmpty();
    }

    public static void main(String[] args) {
        List  list =null;
        System.out.println(isEmpty(list));
    }

    /**
     * 判断集合是否不为空
     * @param collection
     * @return true 不为空 false 为空
     */
    public static boolean isNotEmpty(Collection<?> collection){
        return !isEmpty(collection);
    }


    /**
     * 判断数量是否大于等于 num
     * @param collection
     * @param num 判断数量
     * @return
     */
    public static boolean isGe(Collection<?> collection,Integer num){
        return isNotEmpty(collection) && (isGt(collection,num) || isNq(collection,num));
    }
    /**
     * 判断数量是否等于 num
     * @param collection
     * @param num 判断数量
     * @return
     */
    public static boolean isNq(Collection<?> collection,Integer num){
        return isNotEmpty(collection) && num != null && num.equals(collection.size());
    }
    /**
     * 判断数量是否小于等于 num
     * @param collection
     * @param num 判断数量
     * @return
     */
    public static boolean isLe(Collection<?> collection,Integer num){
        return isNotEmpty(collection) && (isLt(collection,num) || isNq(collection,num));
    }
    /**
     * 判断数量是否大于 num
     * @param collection
     * @param num 判断数量
     * @return
     */
    public static boolean isGt(Collection<?> collection,Integer num){
        return !isEmpty(collection) && num != null && collection.size() > num;
    }
    /**
     * 判断数量是否小于 num
     * @param collection
     * @param num 判断数量
     * @return
     */
    public static boolean isLt(Collection<?> collection,Integer num){
        return !isEmpty(collection) && num != null && collection.size() < num;
    }

    /**
     * 将List集合分为每{@size}组为一组
     * @param coll 原集合
     * @param size 每组大小
     * @param <T>  集合元素类型
     * @return 返回List<List<T>>
     */
    public static <T> List<List<T>> getListGroup(List<T> coll,Integer size){
        if(isEmpty(coll) || size == null){
            return null;
        }
        //使用阻塞队列保存原始集合
        BlockingQueue<T> tBlockingQueue =new LinkedBlockingQueue<>(coll);
        int groupNum =coll.size() / size; //组数
        int remainder =coll.size() % size; //取模
        if(remainder > 0){
            groupNum++;
        }
        List<List<T>> lists =new ArrayList<>();
        for (int i = 0; i < groupNum; i++) {
            List<T> ts =new ArrayList<>();
            //最后一组取剩下所有数据
            tBlockingQueue.drainTo(ts,size);
            lists.add(ts);
        }
        return lists;
    }
}
