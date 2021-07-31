package com.mrpeng.config.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 生成质检单对象
 * @author: pqq
 * @create: 2021-02-08 10:02
 **/
@Data
@ApiModel(description = "生成质检单对象")
public class SaveMoRInspectDTO {
    @ApiModelProperty(value = "单据类型",hidden = true)
    private String docType; //单据类型

    @ApiModelProperty(value = "工艺单身主键",required = true)
    @NotBlank(message = "工艺单身主键不能为空")
    private String moRoutingDId; //工艺单单身主键

    @ApiModelProperty(value = "送检人员",required = true)
    @NotBlank(message = "送检人员不能为空")
    private String userId; //送检人员

    @ApiModelProperty(value = "送检部门",required = true)
    @NotBlank(message = "送检部门不能为空")
    private String deptId; //送检部门

    @ApiModelProperty(value = "检验部门",required = true)
    @NotBlank(message = "检验部门不能为空")
    private String inspectDept;  //检验部门

    @ApiModelProperty(value = "检验人员",required = true)
    @NotBlank(message = "检验人员不能为空")
    private  String inspectEmp; //检验人员

    @ApiModelProperty(value = "工艺ID",required = true)
    @NotBlank(message = "工艺ID不能为空")
    private String operationId; //工艺ID

    @ApiModelProperty(value = "工单主键",required = true)
    @NotBlank(message = "工单主键不能为空")
    private String moId;

    @ApiModelProperty(value = "质检单号")
    @NotBlank(message = "质检单号不能为空")
    private String docNo;

    @ApiModelProperty(value = "下一道工序的单身主键",hidden = true)
    private  String toMoRoutingDId;
}
