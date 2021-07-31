package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 物流单单身视图对象
 * @author: pqq
 * @create: 2021-02-02 11:21
 **/
@Data
@ApiModel(description = "物流单详细对象")
public class TransportBodyVO {
    @ApiModelProperty(value = "物流单单身主键")
    private String transportDId;

    @ApiModelProperty(value = "品名")
    private String itemDescription;

    @ApiModelProperty(value = "规格")
    private String itemSpecification;

    @ApiModelProperty(value = "物料数量")
    private Double transportQty;

    @ApiModelProperty(value = "单位")
    private String unitName;

    @ApiModelProperty(value = "材料品号")
    private String itemCode;

    @ApiModelProperty(value = "工单单身")
    private String moDId;

}
