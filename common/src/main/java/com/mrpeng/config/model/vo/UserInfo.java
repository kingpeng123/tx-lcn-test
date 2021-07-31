package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: pqq
 * @create: 2020-12-24 08:18
 **/
@Data
@ApiModel("用户信息")
public class UserInfo implements Serializable {
    @ApiModelProperty(value = "用户编号",hidden = true)
    private String userId;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "员工名")
    private String empName;

    @ApiModelProperty(value = "角色id")
    private String roleId;

    @ApiModelProperty(value = "公司")
    private String company;

    @ApiModelProperty(value = "工位编号")
    private String stationId;

    @ApiModelProperty(value = "部门ID")
    private String deptId;

    @ApiModelProperty(value = "部门名称")
    private String adminUnitName;

    @ApiModelProperty(value = "部门编号")
    private String adminUnitCode;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "电话")
    private String mobile;

    @ApiModelProperty(value = "性别")
    private String gender;

    @ApiModelProperty(value = "头像")
    private String headImg;

    @ApiModelProperty(value = "出勤 1，未出勤 0")
    private Integer attendance;

    @ApiModelProperty(value = "审核状态 0 未通过，1 通过")
    private Integer auditStatus;

    @ApiModelProperty(value = "工作状态(1.空闲;2.工作中)")
    private Integer workStatus;

    @ApiModelProperty(value = "注册时间")
    private Date registerDate;

    @ApiModelProperty(value = "最后一次登录时间")
    private Date lastLoginDate;

    @ApiModelProperty(value = "公司ID")
    private String companyId;
}
