package com.mrpeng.config.model.qo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 *
 * 到货单查询对象
 * @author: pqq
 * @create: 2021-02-22 10:05
 **/
@Data
public class PurchaseArrivalQO {
    @ApiModelProperty(value = "到货单号")
    private String purchaseArrivalDoc;

    @ApiModelProperty(value = "到货单主键")
    private String purchaseArrivalId;

    @ApiModelProperty(value = "采购单号")
    private String purchaseOrderDoc;

    @ApiModelProperty(value = "采购单主键")
    private String purchaseOrderId;

    @ApiModelProperty(value = "单据类型")
    private String docCode;

    @ApiModelProperty(value = "单据类型名称")
    private String docName;

    @ApiModelProperty(value = "到货单状态")
    private String purchaseArrivalStatus;

    @ApiModelProperty(value = "单据日期(任务时间)")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date docDate;

    @ApiModelProperty(value = "到货时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date arrivalDate;

    @ApiModelProperty(value = "收货机构")
    private String plantName;

    @ApiModelProperty(value = "收获机构编码")
    private String planCode;

    @ApiModelProperty(value = "采购员")
    private String purchaseEmp;

    @ApiModelProperty(value = "采购部门")
    private String purchaseDept;

    @ApiModelProperty(value = "原币未税金额")
    private Double amountUnincludeTaxOc;

    @ApiModelProperty(value = "原币税额")
    private Double taxOc;

    @ApiModelProperty(value = "合计金额(未税金额+税额)")
    private Double amountTotal;

    @ApiModelProperty(value = "备注")
    private String purchaseArrivalRemark;

    @ApiModelProperty(value = "供货商全名")
    private String supplierFullName;

    @ApiModelProperty(value = "到货单身主键")
    private String purchaseArrivalDId;


    @ApiModelProperty(value = "商品类型:GoodsType\n" +
            "1.商品\n" +
            "2.赠品\n" +
            "3.备品\n" +
            "4.CKD母件\n" +
            "5.CKD子件\n" +
            "6.折扣\n" +
            "7.供应商供料\n" +
            "8.退货折扣")
    private String itemType;

    @ApiModelProperty(value = "材料品名")
    private String itemDescription;

    @ApiModelProperty(value = "材料规格")
    private String itemSpecification;

    @ApiModelProperty(value = "材料品号")
    private String itemCode;

    @ApiModelProperty(value = "计价数量")
    @TableField("PRICE_QTY")
    private Double priceQty;

    @ApiModelProperty(value = "库存单位数量")
    @TableField("INVENTORY_QTY")
    private Double inventoryQty;

    @ApiModelProperty(value = "单价")
    @TableField("PRICE")
    private Double price;

    @ApiModelProperty(value = "折扣率")
    @TableField("DISCOUNT_RATE")
    private Double discountRate;

    @ApiModelProperty(value = "折扣额")
    @TableField("DISCOUNT_AMT")
    private Double discountAmt;

    @ApiModelProperty(value = "折扣后单价")
    @TableField("DISCOUNTED_PRICE")
    private Double discountedPrice;

    @TableField("TAX_RATE")
    private Double taxRate;


    @ApiModelProperty(value = "金额")
    private Double amount;

    @ApiModelProperty(value = "允收业务数量")
    @TableField("ACCEPTED_BUSINESS_QTY")
    private Double acceptedBusinessQty;

    @ApiModelProperty(value = "允收库存单位数量")
    @TableField("ACCEPTED_INVENTORY_QTY")
    private Double acceptedInventoryQty;


    @ApiModelProperty(value = "超期码")
    @TableField("OVERDUE_INDICATOR")
    private Boolean overdueIndicator;

    @ApiModelProperty(value = "检验状态")
    @TableField("INSPECTION_STATUS")
    private String inspectionStatus;

    @ApiModelProperty(value = "已入库业务数量")
    @TableField("RECEIPTED_BUSINESS_QTY")
    private Double receiptedBusinessQty;

    @ApiModelProperty(value = "入库结束码 Close\n" +
            "0.未结束\n" +
            "1.指定结束\n" +
            "2.已结束")
    @TableField("RECEIPT_CLOSE")
    private String receiptClose;

    @ApiModelProperty(value = "到货物料备注")
    private String purchaseArrivalDRemark;

    @ApiModelProperty(value = "采购类型PurchaseType\n" +
            "1.一般采购\n" +
            "2.工单委外\n" +
            "3.工艺委外\n" +
            "4.供应商供料\n" +
            "5.VMI采购")
    @TableField("PURCHASE_TYPE")
    private String purchaseType;

    @ApiModelProperty(value = "计价单位")
    private String priceUnitName;

    @ApiModelProperty(value = "业务单位")
    private String businessUnitName;

    @ApiModelProperty(value = "业务数量")
    @TableField("BUSINESS_QTY")
    private Double businessQty;

    @ApiModelProperty(value = "税种名称")
    private String taxName;

    @ApiModelProperty(value = "入库仓库")
    private String warehouseName;

    @ApiModelProperty(value = "批号")
    private String itemLotCode;


    @ApiModelProperty(value = "应结算计价数量")
    @TableField("SHOULD_SETTLE_PRICE_QTY")
    private Double shouldSettlePriceQty;


}
