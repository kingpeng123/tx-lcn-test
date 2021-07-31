package com.mrpeng.config.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 领料出库单单头视图
 * @author: pqq
 * @create: 2021-02-03 12:54
 **/
@Data
@ApiModel(description = "领料出库单视图对象")
public class PickOutboundHeadVO {
    @ApiModelProperty(value = "领料出库单主键")
    private String pickOutboundId;

    @ApiModelProperty(value = "领料出库单号")
    private String pickOutboundDoc;

    @ApiModelProperty(value = "单据类型编号")
    private String docCode;

    @ApiModelProperty(value = "单据类型名称")
    private String docName;

    @ApiModelProperty(value = "单据时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date docDate;

    @ApiModelProperty(value = "领料日期")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date pickDate;

    @ApiModelProperty(value = "领料部门")
    private String pickDept;

    @ApiModelProperty(value = "领料人员")
    private String pickEmp;

    @ApiModelProperty(value = "出库单审核状态(Y,确认出库;N,未确认)")
    private String auditStatus;

    @ApiModelProperty(value = "关联工单")
    private String moId;

    @ApiModelProperty(value = "工单号")
    private String docNo;

    @ApiModelProperty(value = "产品品名")
    private String itemDescription;

    @ApiModelProperty(value = "产品规格")
    private String itemSpecification;

    @ApiModelProperty(value = "产品品号")
    private String itemCode;

    @ApiModelProperty(value = "需求产量")
    private Double planQty;

    @ApiModelProperty(value = "预计开工日期")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date planStartDate;

    @ApiModelProperty(value = "预计完工日期")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date planCompleteDate;

    @ApiModelProperty(value = "工号")
    private String udf021;

    @ApiModelProperty(value = "用户")
    private String udf022;

    @ApiModelProperty(value = "客户")
    private String customerName;

    @ApiModelProperty(value = "单位")
    private String unitName;

    @ApiModelProperty(value = "配料单号")
    private String ingredientsNo;

    @ApiModelProperty(value = "配料单主键")
    private String ingredientsId;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "工单是否加急")
    private String urgent;
}
