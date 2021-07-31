package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(description = "工单工艺详细信息对象")
public class MoCraftDetailVO extends MoHeadInfoVO implements Serializable {

    @ApiModelProperty(value = "工单工艺详情列表")
    List<MoCraftBodyVO> craftBody;
}
