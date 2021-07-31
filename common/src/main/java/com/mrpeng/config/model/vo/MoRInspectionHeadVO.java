package com.mrpeng.config.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 工艺质检单头
 * @author: pqq
 * @create: 2021-02-07 15:49
 **/
@Data
@ApiModel(description = "工艺质检单头视图对象")
public class MoRInspectionHeadVO {

    @ApiModelProperty(value = "工艺检验单号")
    private String moRInspectionDoc;

    @ApiModelProperty(value = "工艺检验单主键")
    private String moRInspectionId;

    @ApiModelProperty(value = "工单主键")
    private String moId;

    @ApiModelProperty(value = "关联工单号")
    private String docNo;

    @ApiModelProperty(value = "单据类型编号")
    private String docCode;

    @ApiModelProperty(value = "单据类型名称")
    private String docName;

    @ApiModelProperty(value = "工艺单身ID")
    private String moRoutingDId;

    @ApiModelProperty(value = "工位编号")
    private String stationNo;

    @ApiModelProperty(value = "关联销售单")
    private String salesOrderDoc;

    @ApiModelProperty(value = "品号")
    private String itemCode;

    @ApiModelProperty(value = "品号ID")
    private String itemId;

    @ApiModelProperty(value = "品名")
    private String itemDescription;

    @ApiModelProperty(value = "规格")
    private String itemSpecification;

    @ApiModelProperty(value = "需求产量")
    private Double planQty;

    @ApiModelProperty(value = "单位")
    private String unitName;

    @ApiModelProperty(value = "工艺编码")
    private String operationCode;

    @ApiModelProperty(value = "工艺名称")
    private String operationName;

    @ApiModelProperty(value = "单据时间（任务时间）")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Date docDate;

    @ApiModelProperty(value = "工号")
    private String udf021;

    @ApiModelProperty(value = "用户")
    private String udf022;

    @ApiModelProperty(value = "客户")
    private String customerName;

    @ApiModelProperty(value = "判定状态 1合格 2不合格")
    private String decision;

    @ApiModelProperty(value = "关联工单是否加急")
    private Boolean urgent;

    @ApiModelProperty(value = "业务判断状态(1未判定，2部分判定，3已判定)")
    private String resultStatus;

    @ApiModelProperty(value = "备注")
    private String remark;


}
