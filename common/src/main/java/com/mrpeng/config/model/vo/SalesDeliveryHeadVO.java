package com.mrpeng.config.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 销货单单头视图对象
 * @author: pqq
 * @create: 2021-03-01 15:54
 **/
@ApiModel(description = "销货单单头视图对象")
@Data
public class SalesDeliveryHeadVO {

    @ApiModelProperty(value = "销货单号")
    private String docNo;

    @ApiModelProperty(value = "主键")
    private String salesDeliveryId;

    @ApiModelProperty(value = "销售单号")
    private String salesOrderDoc;

    @ApiModelProperty(value = "单据日期")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date docDate;

    @ApiModelProperty(value = "单据类型")
    private String docCode;

    @ApiModelProperty(value = "单据类型名称")
    private String docName;


    @ApiModelProperty(value = "销售部门")
    private String salesDept;

    @ApiModelProperty(value = "销售人员")
    private String salesEmp;

    @ApiModelProperty(value = "销货日期")
    private Date transactionDate;

    @ApiModelProperty(value = "出货工厂/储运")
    private String plantName;

    @ApiModelProperty(value = "客户")
    private String customerName;

    @ApiModelProperty(value = "收货客户")
    private String shipToCustomerName;

    @ApiModelProperty(value = "结算公司")
    private String invoiceCompanyName;

    @ApiModelProperty(value = "结算客户全称")
    private String invoiceCustomerFullName;

    @ApiModelProperty(value = "发票种类")
    private String taxInvoiceCategoryName;

    @ApiModelProperty(value = "订金冲减")
    private Boolean offsetDepositIndicator;

    @ApiModelProperty(value = "出库状态:0.不需出库，1.未出库，2.部分出库，3.出库结束")
    private String issuedStatus;

    @ApiModelProperty(value = "当前可结算")
    private Boolean settlementIndicator;

    @ApiModelProperty(value = "含税")
    private Boolean taxIncluded;

    @ApiModelProperty(value = "备注")
    private String remark;

}
