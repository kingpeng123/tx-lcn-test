package com.mrpeng.config.model.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 到货单身视图对象
 * @author: pqq
 * @create: 2021-02-20 16:15
 **/
@Data
@ApiModel(description = "到货单身视图对象")
public class PurchaseArrivalBodyVO {
    @ApiModelProperty(value = "到货单身主键")
    private String purchaseArrivalDId;

    @ApiModelProperty(value = "到货单主键")
    private String purchaseArrivalId;

    @ApiModelProperty(value = "商品类型:GoodsType1.商品2.赠品3.备品4.CKD母件5.CKD子件6.折扣7.供应商供料8.退货折扣" )
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

    @ApiModelProperty(value = "原币未税金额")
    @TableField("AMOUNT_UNINCLUDE_TAX_OC")
    private Double amountUnincludeTaxOc;

    @ApiModelProperty(value = "原币税额")
    @TableField("TAX_OC")
    private Double taxOc;

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
    private String inspectionStatus;

    @ApiModelProperty(value = "已入库业务数量")
    private Double receiptedBusinessQty;

    @ApiModelProperty(value = "入库结束码 Close0.未结束1.指定结束2.已结束")
    private String receiptClose;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "采购类型")
    private String purchaseType;

    @ApiModelProperty(value = "计价单位")
    private String priceUnitName;

    @ApiModelProperty(value = "业务单位")
    private String businessUnitName;

    @ApiModelProperty(value = "业务数量")
    private Double businessQty;

    @ApiModelProperty(value = "税种名称")
    private String taxName;

    @ApiModelProperty(value = "入库仓库")
    private String warehouseName;

    @ApiModelProperty(value = "批号")
    private String itemLotCode;

    @ApiModelProperty(value = "采购订单ID")
    private String purchaseOrderId;

    @ApiModelProperty(value = "应结算计价数量")
    private Double shouldSettlePriceQty;



}
