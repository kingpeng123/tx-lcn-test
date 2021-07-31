package com.mrpeng.config.model.myenum;

/**
 * 工单工艺状态量
 * @author: pqq
 * @create: 2020-12-26 12:48
 **/
public enum  RoutStatusEnum {

    ROUT_NO_PROCESS("0","不可开工"),
    ROUT_WORKABLE("1","可开工"),
    ROUT_PROCESSING("2","加工中"),
    ROUT_PAUSING("3","暂停中"),
    ROUT_PROCESSED("4","加工完成"),
    INSPECTION_NOT_ASSIGNED("5","质检不通过"),
    ROUT_INSPECTION_NO_PASSED("6","质检通过"),
    ROUT_INSPECTION_PASSED("7","质检中"),
    ROUT_FREEZING("8","冻结中");
    private String key;
    private String value;


    RoutStatusEnum(String key,String value){
        this.key =key;
        this.value= value;
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
