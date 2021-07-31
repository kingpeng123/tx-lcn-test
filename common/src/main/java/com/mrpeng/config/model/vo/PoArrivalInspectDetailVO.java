package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 采购到货质检单详情视图对象
 * @author: pqq
 * @create: 2021-02-07 16:32
 **/
@Data
@ApiModel(description = "采购到货质检单详情视图对象")
public class PoArrivalInspectDetailVO {

    @ApiModelProperty(value = "采购到货质检单单头")
    private PoArrivalInspectionHeadVO poArrivalInspectionHead;

    @ApiModelProperty(value = "采购到货质检单单身")
    private List<PoArrivalInspectBodyVO> poArrivalInspectBodies;
}
