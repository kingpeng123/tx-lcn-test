package com.mrpeng.config.model.myenum;

/**
 * 入库单类型
 * @author: pqq
 * @create: 2021-01-26 15:06
 **/
public enum  ReceiptStatusEnum {
    STAY_IN_THE_STATION("1","留在工位"),
    MORTGAGE_WAREHOUSE("2","抵押仓库"),
    WAREHOUSING_COMPLETED("3","入库完成"),
    TRANSPORTING("4","运输中"),
    TRANSPORTED("5","运输完成")
    ;


    private String key;
    private String value;

    ReceiptStatusEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
