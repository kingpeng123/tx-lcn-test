package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 采购入库单 详情对象
 * @author: pqq
 * @create: 2021-01-14 10:05
 **/
@Data
@ApiModel("采购入库单详情对象")
public class PurchaseReceiptDetailVO {
    @ApiModelProperty(value = "单头")
    private PurchaseReceiptHeadVO purchaseReceiptHead;

    @ApiModelProperty(value = "明细")
    private List<PurchaseReceiptBodyVO> purchaseReceiptBodies;
}
