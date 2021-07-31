package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 到货单详情视图对象
 * @author: pqq
 * @create: 2021-02-19 16:52
 **/
@Data
@ApiModel(description = "到货单详情视图对象")
public class PurchaseArrivalDetailVO {
    @ApiModelProperty(value = "到货单头信息对象")
    private PurchaseArrivalHeadVO purchaseArrivalHead;

    @ApiModelProperty(value = "到货单物料详细对象集合")
    private List<PurchaseArrivalBodyVO> purchaseArrivalBodies;

}
