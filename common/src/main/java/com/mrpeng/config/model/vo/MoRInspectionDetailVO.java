package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 工艺质检单详情视图对象
 * @author: pqq
 * @create: 2021-02-07 15:51
 **/
@Data
@ApiModel(description = "工艺质检单详情视图")
@AllArgsConstructor
@NoArgsConstructor
public class MoRInspectionDetailVO {

    @ApiModelProperty(value = "工艺质检单单头")
    private MoRInspectionHeadVO moRInspectionHead;

    @ApiModelProperty(value = "工艺质检单单身")
    private MoRInspectionBodyVO moRInspectionBody;
}
