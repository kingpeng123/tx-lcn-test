package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 质检结果对象
 * @author: pqq
 * @create: 2021-02-04 08:31
 **/
@Data
@ApiModel(description = "质检结果接受对象")
public class InspectResult {
    @ApiModelProperty(value = "当前用户",required = true)
    @NotBlank(message ="用户ID不能为空")
    private String userId;

    @ApiModelProperty(value = "用户部门ID",required = true)
    @NotBlank(message = "用户部门ID不能为空")
    private String deptId;

    @ApiModelProperty(value = "工单主键",notes = "")
    private String moId;

    @ApiModelProperty(value = "工艺单单身主键")
    private String moRoutingDId;

    @ApiModelProperty(value = "单据类型",required = true)
    @NotBlank(message = "单据类型不能为空")
    private String docType;

    @ApiModelProperty(value = "单据主键ID",required = true)
    @NotBlank(message = "单据Id不能为空")
    private String id;

    @ApiModelProperty(value = "质检结果",required = true)
    @NotBlank(message = "质检结果不能为空")
    private String result;

    @ApiModelProperty(value = "质检通过数量",required = true,dataType = "double")
    @NotNull(message = "质检通过数量不能为空")
    private Double passQuantity;
}
