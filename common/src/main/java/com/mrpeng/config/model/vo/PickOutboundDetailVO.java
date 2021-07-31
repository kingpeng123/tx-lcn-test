package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 领料出库单详情试图对象
 * @author: pqq
 * @create: 2021-02-03 12:57
 **/
@Data
@ApiModel(description = "领料出库单详情视图")
@AllArgsConstructor
@NoArgsConstructor
public class PickOutboundDetailVO {
    @ApiModelProperty(value = "领料出库单单头")
    private PickOutboundHeadVO pickOutboundHead;

    @ApiModelProperty(value = "领料出库单单身列表")
    private List<PickOutboundBodyVO> pickOutboundBodies;
}
