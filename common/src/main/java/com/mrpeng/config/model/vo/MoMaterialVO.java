package com.mrpeng.config.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "工单需求材料对象")
public class MoMaterialVO {

    @ApiModelProperty(value = "主键")
    private String moDId;

    @ApiModelProperty(value = "品号")
    private String itemCode;

    @ApiModelProperty(value = "材料品名")
    private String itemName;

    @ApiModelProperty(value = "材料描述")
    private String itemRemark;

    @ApiModelProperty(value = "材料ID")
    private String itemId;

    @ApiModelProperty(value = "材料规格")
    private String itemSpecification;

    @ApiModelProperty(value = "预计用量")
    private Double requiredQty;

    @ApiModelProperty(value = "仓库")
    private String warehouseName;

    @ApiModelProperty(value = "厂库ID")
    private String warehouseId;

    @ApiModelProperty(value = "单位名称")
    private String  unitName;

    @ApiModelProperty(value = "预计领料日期")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date planIssueDate;

    @ApiModelProperty(value = "供料方式")
    private String itemType;

    @ApiModelProperty(value = "物料状态（0,未配料;1,配料完成;2,运输中;3已送达,4,加工中;5,加工完成）")
    private Integer bomStatus;

    @ApiModelProperty(value = "物料位置")
    private String location;

    @ApiModelProperty(value = "物料出库状态（0，未出库；1，已出库）")
    private String outboundStatus;

    @ApiModelProperty(value = "物料领料状态（0,未领料;1,已领料;）")
    private String pickStatus;

}
