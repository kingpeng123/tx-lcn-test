package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 物流单详情视图
 * @author: pqq
 * @create: 2021-02-02 10:39
 **/
@Data
@ApiModel(description = "物流单详情视图对象")
public class TransportDetailVO {

    @ApiModelProperty(value = "物流单单头信息")
    private TransportHeadVO transportHead;

    @ApiModelProperty(value = "物流单身详细")
    private List<TransportBodyVO> transportBody;
}
