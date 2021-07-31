package com.mrpeng.config.model.myenum;

import org.apache.commons.lang3.StringUtils;

/**
 * @author pengquan
 * @version 1.0
 * @classname WorkCenterEnum
 * @description 工作中心枚举
 * @date 2021/6/22 17:06
 **/
public enum WorkCenterEnum {
    PRODUCTION("1","生产车间","EDE438C7-8419-42A2-EB22-15E259626C6D"),
    WELDING("2","焊接车间","95130408-DE1F-42FD-81DE-16FBA9ACFE02");
    private String code;
    private String name;
    private String id;

    WorkCenterEnum(String code, String name, String id) {
        this.code = code;
        this.name = name;
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * 根据code值获取工作中行的ID
     * @author pengquan
     * @date 2021/7/7 15:33
     * @param code
     * @return com.yuansheng.common.model.myenum.WorkCenterEnum
     */
    public static WorkCenterEnum getIdByCode(String code){
        if(StringUtils.isBlank(code)) return null;
        for (WorkCenterEnum value : WorkCenterEnum.values()) {
            if(value.getCode().equals(code)){
                return value;
            }
        }
        return null;
    }
}
