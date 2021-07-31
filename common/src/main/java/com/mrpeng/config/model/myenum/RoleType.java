package com.mrpeng.config.model.myenum;

import org.apache.commons.lang3.StringUtils;

public enum  RoleType {
    // 生产工人
    Produce_Emp("1", "生产工人","1"),
    // 生产管理
    Produce_Admin("2", "生产管理员","1"),
    // 系统管理员
    System_Admin("7", "系统管理员","1"),
    //仓库
    WareHouse("4","仓库","1"),
    //物流
    Transport("8","物流","1"),
    //质检
    Inspection("3","质检","1"),
    //供应商
    Supplier("5","供应商","2"),
    //终端客户
    Customer("6","终端客户","3");

    private String code;
    private String remark;
    private String type;

    public static RoleType matchRoleById(String roleId) {
        if(StringUtils.isBlank(roleId)) return null;
        for (RoleType value : RoleType.values()) {
            if(value.getCode().equals(roleId)){
                return value;
            }
        }
        return null;
    }


    public String getCode() {
        return code;
    }

    public String getRemark() {
        return remark;
    }

    public String getType() {
        return type;
    }

    private RoleType(String code, String remark, String type) {
        this.code = code;
        this.remark = remark;
        this.type =type;
    }

    // 根据code获取用户类型
    public static RoleType getType(String code) {
        for (RoleType type : values()) {
            if (code.equals(type.getCode())) {
                return type;
            }
        }

        return null;
    }
    //返回用户类型  1本部
    public static String getTypeByRoleId(String roleId) {
        for (RoleType value : values()) {
            if(roleId.equals(value.getCode())){
                return value.getType();
            }
        }
        return "";
    }


    // 是否为超级管理员
    public static boolean isSystemAdmin(String role) {
        if (role == null) {
            return false;
        }

        if (RoleType.System_Admin.getCode() == role) {
            return true;
        } else {
            return false;
        }
    }

    // 是否为班组长
    public static boolean isProduceAdmin(String role) {
        if (role == null) {
            return false;
        }

        if (RoleType.Produce_Admin.getCode().equals(role)) {
            return true;
        } else {
            return false;
        }
    }

    // 是否为生产工人
    public static boolean isProduceEmp(String code) {
        if (code == null) {
            return false;
        }
        if (RoleType.Produce_Emp.getCode().equals(code)) {
            return true;
        } else {
            return false;
        }
    }

    // 是否为物流工人
    public static boolean isTransportEmp(String code) {
        if (code == null) {
            return false;
        }
        if (RoleType.Transport.getCode().equals(code)) {
            return true;
        } else {
            return false;
        }
    }

    //判断是否未仓库员工
    public static boolean isWarehouseEmp(String code){
        if(code == null){
            return false;
        }
        if(RoleType.WareHouse.getCode().equals(code)){
            return true;
        }else{
            return false;
        }
    }

    //判断是否未仓库员工
    public static boolean isInspection(String code){
        if(code == null){
            return false;
        }
        if(RoleType.Inspection.getCode().equals(code)){
            return true;
        }else{
            return false;
        }
    }
}
