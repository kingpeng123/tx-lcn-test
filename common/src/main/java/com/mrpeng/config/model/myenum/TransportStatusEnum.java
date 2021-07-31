package com.mrpeng.config.model.myenum;

/**
 * 物流单状态量
 * @author: pqq
 * @create: 2021-01-19 09:20
 **/
public enum  TransportStatusEnum {
    NOT_ACCEPTED(0,"未接受"),
    NOT_IMPLEMENTED(1,"未进行"),
    IMPLEMENTING(2,"进行中"),
    COMPLETED(3,"已完成"),
    UNDER_REVIEW(4,"审核中"); //只有入库物流单使用该属性


    private Integer key;
    private String value;
    TransportStatusEnum(Integer key,String value) {
        this.key =key;
        this.value =value;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
