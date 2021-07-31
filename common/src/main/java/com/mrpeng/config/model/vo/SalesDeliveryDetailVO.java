package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 销货单详情视图对象
 * @author: pqq
 * @create: 2021-03-01 15:55
 **/
@ApiModel(description = "销货单详情视图对象")
@Data
public class SalesDeliveryDetailVO {
    @ApiModelProperty(value = "销货单单头")
    private SalesDeliveryHeadVO salesDeliveryHead;

    @ApiModelProperty(value = "销货单单身")
    private List<SalesDeliveryBodyVO> salesDeliveryBodies;

}
