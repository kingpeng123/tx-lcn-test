package com.mrpeng.config.model.myenum;

public enum  MoStatusEnum {

    NO_INGREDIENTS("1","未配料"),
    MIXED("2","已配料"),
    ASSIGNED("3","已派工"),
    ISSUED_MATERIALS("4","已发料"),
    IN_PRODUCTION("5","生产中"),
    COMPLETED("Y","已完工"),
    DESIGNATED_COMPLETION("y","指定完工");

    private String key;

    private String value;

    MoStatusEnum(String key, String value) {
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
