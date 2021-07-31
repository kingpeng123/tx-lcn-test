package com.mrpeng.config.model.qo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 销货单查询对象
 * @author: pqq
 * @create: 2021-03-02 12:03
 **/
@Data
@ApiModel(description = "销货单查询对象")
public class SalesDeliveryQO {
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

    @ApiModelProperty(value = "销货单备注")
    private String salesDeliveryRemark;

    @ApiModelProperty(value = "GUID")
    private String salesDeliveryDId;

    @ApiModelProperty(value = "品号")
    private String itemCode;

    @ApiModelProperty(value = "品名")
    private String itemDescription;

    @ApiModelProperty(value = "规格")
    private String itemSpecification;

    @ApiModelProperty(value = "商品类型1.商品2.赠品3.备品4.CKD母件5.CKD子件6.折扣7.供应商供料8.退货折扣")
    private String itemType;

    @ApiModelProperty(value = "业务数量")
    private Double businessQty;

    @ApiModelProperty(value = "计价数量")
    private Double priceQty;

    @ApiModelProperty(value = "业务单位")
    private String businessUnitName;

    @ApiModelProperty(value = "计价单位")
    private String priceUnitName;

    @ApiModelProperty(value = "库存单位数量")
    private Double inventoryQty;

    @ApiModelProperty(value = "金额")
    private Double amount;

    @ApiModelProperty(value = "物料备注")
    private String salesDeliveryDRemark;

    @ApiModelProperty(value = "出货仓库")
    private String warehouseName;

    @ApiModelProperty(value = "销货类型:1.一般销货2.借出销货3.寄售销货")
    private String salesType;

    @ApiModelProperty(value = "已出库业务数量")
    private Double issuedQty;

    @ApiModelProperty(value = "已出库计价数量")
    private Double issuedPriceQty;

    @ApiModelProperty(value = "已出库0.未出库1.指定结束2.已结束")
    private String issued;

    @ApiModelProperty(value = "销售订单主键")
    private String salesOrderDocId;

    @ApiModelProperty(value = "检验状态1.免检2.待检3.部分检验4.检验完成")
    private String inspectionStatus;

    @ApiModelProperty(value = "送检数量")
    private Double inspectQty;

    @ApiModelProperty(value = "合格业务数量")
    private Double qualifiedBusinessQty;

    @ApiModelProperty(value = "不合格业务数量")
    private Double unqualifiedBusinessQty;

    @ApiModelProperty(value = "检验破坏业务数量")
    private Double inDestroyedBusinessQty;

    @ApiModelProperty(value = "允出业务数量")
    private Double acceptedBusinessQty;

    @ApiModelProperty(value = "允出库存单位数量")
    private Double acceptedInventoryQty;

    @ApiModelProperty(value = "工号")
    private String udf021;

    @ApiModelProperty(value = "用户")
    private String udf022;

    @ApiModelProperty(value = "合同序号")
    private String udf023;

    @ApiModelProperty(value = "产品ID")
    private String udf024;

    @ApiModelProperty(value = "合同号")
    private String udf025;

}
