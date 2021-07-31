package com.mrpeng.config.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 领料单物料对象
 * @author: pqq
 * @create: 2021-01-28 16:11
 **/
@Data
public class IssueReceiptDTO {
    @ApiModelProperty(value = "主键")
    private String issueReceiptDId;

    @ApiModelProperty(value = "材料品名")
    private String itemDescription;

    @ApiModelProperty(value = "材料规格")
    private String itemSpecification;

    @ApiModelProperty(value = "供料方式")
    private String itemType;

    @ApiModelProperty(value = "领退料数量")
    private Double issueReceiptQty;

    @ApiModelProperty(value = "实际数量")
    private Double actualIssueReceiptQty;

    @ApiModelProperty(value = "领料第二数量")
    private Double secondQty;

    @ApiModelProperty(value = "实际第二数量")
    private Double actualSecondQty;

    @ApiModelProperty(value = "领料库存数量")
    private Double inventoryQty;

    @ApiModelProperty(value = "实际库存数量")
    private Double actualInventoryQty;

    @ApiModelProperty(value = "大包装数量")
    private Double packingQty1;

    @ApiModelProperty(value = "实际大包装数量")
    private Double actualPackingQty1;

    @ApiModelProperty(value = "中包装数量")
    private Double packingQty2;

    @ApiModelProperty(value = "实际中包装数量")
    private Double actualPackingQty2;

    @ApiModelProperty(value = "小包装数量")
    private Double packingQty3;

    @ApiModelProperty(value = "实际小包装数量")
    private Double actualPackingQty3;

    @ApiModelProperty(value = "最小包装数量")
    private Double packingQty4;

    @ApiModelProperty(value = "实际最小包装数量")
    private Double actualPackingQty4;

    @ApiModelProperty(value = "包装数量描述")
    private String packingQty;

    @ApiModelProperty(value = "领料说明")
    private String issueComment;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "源工单")
    private String sourceMoId;

    @ApiModelProperty(value = "工单单号")
    private String moId;

    @ApiModelProperty(value = "材料品号")
    private String itemId;

    @ApiModelProperty(value = "单位")
    private String unitId;

    @ApiModelProperty(value = "仓库")
    private String warehouseId;

    @ApiModelProperty(value = "工艺")
    private String operationId;

    @ApiModelProperty(value = "库位")
    private String binId;

    @ApiModelProperty(value = "批号")
    private String itemLotId;

    @ApiModelProperty(value = "领料申请单")
    private String issueReceiptReqId;

    @ApiModelProperty(value = "被取替代数量")
    private Double replacedQty;

    @ApiModelProperty(value = "工单单身")
    private String moDId;

    @ApiModelProperty(value = "类别")
    private String sourceType;

    @ApiModelProperty(value = "被取替代工单单身")
    private String replacedMoDId;

    @ApiModelProperty(value = "检核码")
    private String bcCheckStatus;

    @ApiModelProperty(value = "项目")
    private String projectId;

    private String moRoutingDId;

    @ApiModelProperty(value = "自定义字段6")
    private String udf021;

    private String issueReceiptId;


    @ApiModelProperty(value = "单据状态属性")
    private String ApproveStatus;
}
