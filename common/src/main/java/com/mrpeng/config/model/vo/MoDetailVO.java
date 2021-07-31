package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@ApiModel(description = "工单详细信息")
@Data
public class MoDetailVO {

    @ApiModelProperty("工单单头")
    MoHeadInfoVO moHeads;

    @ApiModelProperty(value = "工单需求材料列表")
    List<MoMaterialVO> moMaterials;

    @ApiModelProperty(value = "工单工艺详情列表")
    List<MoCraftBodyVO> craftBody;
}
