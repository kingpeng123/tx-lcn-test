package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 采购到货质检单单身视图对象
 * @author: pqq
 * @create: 2021-02-07 16:30
 **/
@Data
@ApiModel(description = "采购到货质检单单身视图对象")
public class PoArrivalInspectBodyVO {

    @ApiModelProperty(value = "材料品名")
    private String itemDescription;

    @ApiModelProperty(value = "材料规格")
    private String itemSpecification;

    @ApiModelProperty(value = "材料品号")
    private String itemCode;

    @ApiModelProperty(value = "材料品号ID")
    private String itemId;

    @ApiModelProperty(value = "业务单位")
    private String businessUnitName;

    @ApiModelProperty(value = "业务数量")
    private Double businessQty;

}
