package com.mrpeng.config.model.myenum;

/**
 * 领料单状态量
 */
public enum IssueReceiptStatusEnum {

    UNCOLLECTED_MATERIALS("0","未锁定"),
    TRANSPORT_PICKING("1","物流领料"),
    EMP_PICKING("2","员工领料"),
    PICKED("3","领料完成"),
    OUT_OF_STOCK("4","已出库"),


    //领料单审核状态
    NO_AUDIT("0","没有审核"),
    AUDITING("1","审核中");

    private String key;
    private String value;

    IssueReceiptStatusEnum(String key,String value){
        this.key =key;
        this.value =value;
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
