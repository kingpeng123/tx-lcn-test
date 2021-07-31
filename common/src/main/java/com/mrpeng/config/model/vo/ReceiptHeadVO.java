package com.mrpeng.config.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 入库单头部信息
 * @author: pqq
 * @create: 2021-01-06 17:04
 **/
@Data
@ApiModel("入库单单头")
public class ReceiptHeadVO {

    @ApiModelProperty(value = "主键")
    private String moReceiptId;

    @ApiModelProperty(value = "入库单号")
    private String receiptDoc;

    @ApiModelProperty(value = "工单号")
    private String docNo;

    @ApiModelProperty(value = "工单主键")
    private String moId;

    @ApiModelProperty(value = "产品品号")
    private String itemCode;

    @ApiModelProperty(value = "产品品号")
    private String itemId;

    @ApiModelProperty(value = "产品品名")
    private String itemDescription;

    @ApiModelProperty(value = "产品规格")
    private String itemSpecification;

    @ApiModelProperty(value = "验收数量")
    private Double acceptedQty;

    @ApiModelProperty(value = "业务单位")
    private String unitName;

    @ApiModelProperty(value = "工作中心")
    private String workCenterName;

    @ApiModelProperty(value = "物料位置")
    private String stationNo;

    @ApiModelProperty(value = "单据时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date docDate;

    @ApiModelProperty(value = "单据检验状态 Y检验 N未检验")
    private String ApproveStatus;

    @ApiModelProperty(value = "工号")
    private String udf021;

    @ApiModelProperty(value = "用户")
    private String udf022;

    @ApiModelProperty(value = "客户")
    private String customerName;

    @ApiModelProperty(value = "单据类型名称")
    private String docName;

    @ApiModelProperty(value = "单据类型")
    private String docCode;

    @ApiModelProperty(value = "工单入库类型（1,留在工位，2运抵仓库，3,入库完成，4.运输中；5.运输完成）")
    private String receiptStatus;

    @ApiModelProperty(value = "工单是否加急")
    private Boolean urgent;

}
