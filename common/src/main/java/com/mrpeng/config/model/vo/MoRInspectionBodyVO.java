package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 工艺质检单单身
 * @author: pqq
 * @create: 2021-02-07 16:23
 **/
@Data
@ApiModel(description = "工艺质检单单身")
public class MoRInspectionBodyVO {

    @ApiModelProperty(value = "工艺单身主键")
    private String moRoutingDId;

    @ApiModelProperty(value = "工艺ID")
    private String operationId;

    @ApiModelProperty(value = "工艺编码")
    private String operationCode;

    @ApiModelProperty(value = "工序")
    private String operationSeq;

    @ApiModelProperty(value = "工艺名称")
    private String operationName;

    @ApiModelProperty(value = "工艺说明")
    private String operationComment;

    @ApiModelProperty(value = "工艺关联工位ID")
    private String stationId;

    @ApiModelProperty(value = "工位编号")
    private String stationNo;

    @ApiModelProperty(value = "工艺关联工人")
    private String empName;

    @ApiModelProperty(value = "关联设备")
    private String equipment;

}
