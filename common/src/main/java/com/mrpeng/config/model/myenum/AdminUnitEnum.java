package com.mrpeng.config.model.myenum;

import org.apache.commons.lang3.StringUtils;

/**
 * @author pengquan
 * @version 1.0
 * @classname AdminUnitEnum
 * @description 公司部门枚举类
 * @date 2021/6/1 11:15
 **/
public enum  AdminUnitEnum {

    MANAGER_LEVEL("101","管理层","","DDBD2896-045B-4E08-C80B-15C6F1556F42"), //管理层
    FINANCE("102","财务部","","629DC84F-2F35-49ED-AADF-15C6F169B986"), //财务
    HUMAN_RESOURCES("103","人力部","","D7A66D0C-A59E-4F5A-22FE-15C6F17DC88C"), //人力
    PRODUCE("104","生产部","","2491533A-55B9-46DC-11C5-15C6F184C4EE"), //生产
    STORAGE("105","仓储部","","60BB7D5F-CD8B-4EDD-3C66-15C6F18B5851"), //仓储
    PURCHASE("106","采购部","","8839A399-DCEB-4D70-BC82-15C6F1924896"), //采购
    TECHNOLOGY("107","技术部","","ACD4E851-B772-4776-24B6-15C6F19881E1"), //技术
    WARRANTY("108","质保部","","9C6B5D2D-9A6E-44C4-5E12-15C6F19F0509"), //质保
    RAILWAY_PROJECT("111","铁路部","","F3358FEF-E687-454B-3388-163B28F97F19"), //铁路项目
    PROJECT("112","项目部","","239D1B76-9149-4FFD-098C-15C6F1F60825"), // 项目
    SUPPORT("109","后勤","","96D6AB50-724B-4E09-F5C4-163B2915BFFC"), // 后勤
    ORDER_MANAGER("110","订单管理部","","7D09F3E0-FA98-477B-722C-15C6F1FF1364"), //订单管理
    LOGISTICS("117","物流部","","4E1FB444-FF46-4923-968C-904DB984532C"); //订单管理

    private String code;
    private String name;
    private String remark;
    private String id;


    AdminUnitEnum(String code, String name, String remark, String id) {
        this.code = code;
        this.name = name;
        this.remark = remark;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static AdminUnitEnum matchUnitByCode(String code){
        if(StringUtils.isBlank(code)) return null;
        for (AdminUnitEnum adminUnitEnum : AdminUnitEnum.values()) {
            if(adminUnitEnum.getCode().equals(code)){
                return adminUnitEnum;
            }
        }
        return null;
    }
}
