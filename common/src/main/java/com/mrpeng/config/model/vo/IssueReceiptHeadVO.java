package com.mrpeng.config.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.Set;

/**
 * @author: pqq
 * @create: 2021-01-08 11:04
 **/
@Data
public class IssueReceiptHeadVO {

    @ApiModelProperty(value = "领料单号")
    private String issueReceiptDoc;

    @ApiModelProperty(value = "主键")
    private String issueReceiptId;

    @ApiModelProperty(value = "关联工单号")
    private String docNo;

    @ApiModelProperty(value = "关联工单主键")
    private String moId;

    @ApiModelProperty(value = "产品品号")
    private String itemCode;

    @ApiModelProperty(value = "产品品名")
    private String itemDescription;

    @ApiModelProperty(value = "产品规格")
    private String itemSpecification;

    @ApiModelProperty(value = "需求产量")
    private Double planQty;

    @ApiModelProperty(value = "单位")
    private String unitName;

    @ApiModelProperty(value = "预计开工日期")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date planStartDate;

    @ApiModelProperty(value = "预计完工日期")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date planCompleteDate;

    @ApiModelProperty(value = "领料时间")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date transactionDate;

    @ApiModelProperty(value = "物料描述")
    private String itemRemark;

    @ApiModelProperty(value = "领料部门")
    private String pickDept;

    @ApiModelProperty(value = "领料人")
    private String pickEmp;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "仓库")
    private Set<String> warehouseName;

    @ApiModelProperty(value = "工号")
    private String udf021;

    @ApiModelProperty(value = "用户")
    private String udf022;

    @ApiModelProperty(value = "客户")
    private String customerName;

    @ApiModelProperty(value = "单据类型名称")
    private String docName;

    @ApiModelProperty(value = "单据类型编号")
    private String docCode;

    @ApiModelProperty(value = "领料单状态（0，未锁定；1，物流领料；2，员工领料；3，领料完成；4，已出库；）")
    private String issueReceiptStatus;

    @ApiModelProperty(value = "领料单审核状态（0，未审核，1，审核中）")
    private String auditStatus;

    @ApiModelProperty(value = "工单是否加急")
    private Boolean urgent;

}