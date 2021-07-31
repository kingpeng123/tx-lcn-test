package com.mrpeng.config.model.vo;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author: pqq
 * @create: 2020-12-29 15:33
 **/
@Data
@ApiModel(value = "配料单单头对象")
public class IngredientsHeadVO {


    @ApiModelProperty(value = "配料单号")
    private String ingredientsNo;

    @ApiModelProperty(value = "配料单主键")
    private String ingredientsId;

    @ApiModelProperty(value = "工单号")
    private String docNo;

    @ApiModelProperty(value = "工单主键")
    private String moId;

    @ApiModelProperty(value = "预计领料时间(工单计划开工时间)")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date planIssueDate;

    @ApiModelProperty(value = "产品品号")
    private String itemCode;

    @ApiModelProperty(value = "产品品名")
    private String itemDescription;

    @ApiModelProperty(value = "产品规格")
    private String itemSpecification;

    @ApiModelProperty(value = "预计开工日期")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date planStartDate;

    @ApiModelProperty(value = "预计完工日期")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date planCompleteDate;

    @ApiModelProperty(value = "物料参数")
    private String itemRemark;

    @ApiModelProperty(value = "工单是否加急")
    private Boolean urgent;

    @ApiModelProperty(value = "需求产量")
    private Double planQty;

    @ApiModelProperty(value = "工号")
    private String udf021;

    @ApiModelProperty(value = "用户")
    private String udf022;

    @ApiModelProperty(value = "销售单号")
    private String salesOrderDocNo;

    @ApiModelProperty(value = "客户")
    private String customerName;

    @ApiModelProperty(value = "单据类型名称")
    private String docName;

    @ApiModelProperty(value = "单据类型")
    private String docCode;

    @ApiModelProperty(value = "单位")
    private String unitName;

    @ApiModelProperty(value = "物料配料状态（0,未配料;1.配料中;2,配料完成;3,已出库）")
    private Integer ingredientStatus;

    @ApiModelProperty(value = "物料未配料完成数量")
    private Integer outStandNum;

    @ApiModelProperty(value = "物料未出库数量")
    private Integer noOutboundNum;


}
