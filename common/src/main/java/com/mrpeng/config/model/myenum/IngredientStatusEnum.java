package com.mrpeng.config.model.myenum;

/**
 * 配料单状态量
 * @author: pqq
 * @create: 2021-01-13 10:59
 **/
public enum  IngredientStatusEnum {
    NO_INGREDIENTS(0,"未配料"),
    IN_INGREDIENTS(1,"配料中"),
    INGREDIENT_COMPLETE(2,"配料完成"),
    OUT_OF_STOCK(3,"已出库");

    private Integer key;
    private String value;

    IngredientStatusEnum(Integer key,String value){
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
