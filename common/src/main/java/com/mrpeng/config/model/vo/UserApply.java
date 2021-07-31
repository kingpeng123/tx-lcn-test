package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("用户申请对象")
public class UserApply {

    @ApiModelProperty(value = "用户ID")
    private String userId;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "角色编号")
    private String roleId;

    @ApiModelProperty(value = "员工名")
    private String empName;

    @ApiModelProperty(value = "公司名称")
    private String company;

    @ApiModelProperty(value = "token",hidden = true)
    private String token;

    @ApiModelProperty(value = "工位ID",hidden = true)
    private String stationId;

    @ApiModelProperty(value = "部门ID",hidden = true)
    private String deptId;

}
