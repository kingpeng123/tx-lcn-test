package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 接受任务对象
 * @author: pqq
 * @create: 2021-01-28 13:39
 **/
@Data
@ApiModel(description = "接受任务对象")
public class AcceptApply {
    @ApiModelProperty(value = "用户ID")
    private String userId;

    @ApiModelProperty(value = "部门ID")
    private String deptId;

    @ApiModelProperty(value = "工单主键")
    private String moId;

    @ApiModelProperty(value = "单据主键")
    private String id;

    @ApiModelProperty(value = "角色ID")
    private String roleId;

    @ApiModelProperty(value = "单据类型 例如：5A1等等")
    private String docCode;
}
