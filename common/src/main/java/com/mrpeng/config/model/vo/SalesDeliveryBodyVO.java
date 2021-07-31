package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 销货单单身视图对象
 * @author: pqq
 * @create: 2021-03-01 15:54
 **/
@ApiModel(description = "销货单单身视图对象")
@Data
public class SalesDeliveryBodyVO {
    @ApiModelProperty(value = "主键")
    private String salesDeliveryId;

    @ApiModelProperty(value = "销货单单身主键")
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

    @ApiModelProperty(value = "备注")
    private String remark;

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
