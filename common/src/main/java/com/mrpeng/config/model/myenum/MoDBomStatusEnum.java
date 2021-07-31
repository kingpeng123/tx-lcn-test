package com.mrpeng.config.model.myenum;


/**
 * 工单物料的状态
 * @author: pqq
 * @create: 2021-01-28 10:16
 **/
public enum  MoDBomStatusEnum {

    //物料配料状态（0,未配料;1,配料完成;2,运输中;3已送达,4,加工中;5,加工完成）
    NO_INGREDIENTS(0,"未配料"),
    INGREDIENT_COMPLETE(1,"配料完成"),
    TRANSPORT(2,"运输中"),
    ARRIVED(3,"已送达"),
    IN_PROCESS(4,"加工中"),
    PROCESSED(5,"加工完成");

    private Integer key;
    private String value;
    MoDBomStatusEnum(Integer key,String value){
        this.key =key;
        this.value =value;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }
}
