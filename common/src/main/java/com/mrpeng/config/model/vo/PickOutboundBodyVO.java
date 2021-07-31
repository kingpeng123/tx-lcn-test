package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 领料出库单单身视图对象
 * @author: pqq
 * @create: 2021-02-03 12:56
 **/
@Data
@ApiModel(description = "领料出库单单身视图对象")
public class PickOutboundBodyVO {

    @ApiModelProperty(value = "领料出库单单身主键")
    private String pickOutboundDId;

    @ApiModelProperty(value = "领料出库单主键")
    private String pickOutboundId;

    @ApiModelProperty(value = "材料品名")
    private String itemDescription;

    @ApiModelProperty(value = "材料规格")
    private String itemSpecification;

    @ApiModelProperty(value = "材料品号")
    private String itemCode;

    @ApiModelProperty(value = "出库仓库")
    private String warehouseName;

    @ApiModelProperty(value = "出库数量")
    private Double outboundQty;

    @ApiModelProperty(value = "单位")
    private String unitName;

    @ApiModelProperty(value = "工单单身ID")
    private String moDId;




}
