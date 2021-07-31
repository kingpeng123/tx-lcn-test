package com.mrpeng.config.model.myenum;

/**
 * 物流单类型
 * @author: pqq
 * @create: 2021-01-29 10:09
 **/
public enum  TransportType {
    ISSUE(1,"领料物流"),
    TRANSFER(2,"转移物流"),
    ACCESSORIES(3,"辅料物流"),
    RECEIPT(4,"入库物流");

    private Integer type;

    private String name;

    TransportType(Integer type,String name){
        this.type = type;
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static TransportType matchResult(Integer type){
        for (TransportType value : TransportType.values()) {
            if(value.getType().equals(type)){
                return value;
            }
        }
        return null;
    }
}
