package com.mrpeng.config.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 物流单身
 * @author: pqq
 * @create: 2021-01-29 08:09
 **/
@Data
public class TransportBodyDTO {

    @ApiModelProperty(value = "品名")
    private String itemDescription;

    @ApiModelProperty(value = "规格")
    private String itemSpecification;

    @ApiModelProperty(value = "物料数量")
    private Double transportQty;

    @ApiModelProperty(value = "单位")
    private String unitId;

    @ApiModelProperty(value = "材料品号")
    private String itemId;

    @ApiModelProperty(value = "工单单身")
    private String moDId;

    @ApiModelProperty(value = "备注")
    private String remark;

}
