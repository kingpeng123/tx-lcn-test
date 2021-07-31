package com.mrpeng.config.model.myenum;

/**
 * 工艺任务状态
 * @author: pqq
 * @create: 2021-04-09 15:03
 **/
public enum  RoutTaskStatus {
    NO_WORK("0","未进行"),
    WORKING("1","进行中"),
    PAUSE("2","暂停"),
    WORKED("3","完成");

    private String key;
    private String value;

    RoutTaskStatus(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
