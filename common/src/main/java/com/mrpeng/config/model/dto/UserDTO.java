package com.mrpeng.config.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author: pqq
 * @create: 2021-01-22 09:19
 **/
@Data
public class UserDTO {

    @ApiModelProperty(value = "用户编号")
    private String userId;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "token")
    private String token;

    @ApiModelProperty(value = "员工名")
    private String empName;

    @ApiModelProperty(value = "角色编号")
    private String roleId;

    @ApiModelProperty(value = "角色名")
    private String roleName;

    @ApiModelProperty(value = "电话")
    private String mobile;

    @ApiModelProperty(value = "部门编号")
    private String deptId;

    @ApiModelProperty(value = "部门名称")
    private String adminUnitName;

    @ApiModelProperty(value = "车间编号")
    private String farmId;

    @ApiModelProperty(value = "班位编号")
    private String stationId;

    @ApiModelProperty(value = "出勤状态(0.未出勤;1.出勤)")
    private Integer attendance;

    @ApiModelProperty(value = "工作状态(0.空闲;1.工作中)")
    private Integer workStatus;

    @ApiModelProperty(value = "审核状态(0.审核中,1已通过)")
    private Integer auditStatus;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "公司名称")
    private String company;

    @ApiModelProperty(value = "职位")
    private String job;

    @ApiModelProperty(value = "头像")
    private String headImg;

    @ApiModelProperty(value = "逻辑删除 1.已删除;0.未删除")
    private Integer deleted;

    @ApiModelProperty(value = "创建时间")
    private Date createDate;

    @ApiModelProperty(value = "修改时间")
    private String modifyDate;

    @ApiModelProperty(value = "创建人")
    private String creator;

}
