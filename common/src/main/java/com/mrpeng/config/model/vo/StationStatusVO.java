package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 工位状态对象
 * @author: pqq
 * @create: 2021-01-22 08:29
 **/
@Data
@ApiModel(description = "工位状态视图对象")
public class StationStatusVO {
    @ApiModelProperty(value = "工位ID")
    private String stationId;

    @ApiModelProperty(value = "工位编号")
    private String stationNo;

    @ApiModelProperty(value = "工位名称")
    private String stationName;

    @ApiModelProperty(value = "正在加工的品名集合")
    private List<String> itemDescriptions;

    @ApiModelProperty(value ="工位上的员工名集合")
    private List<String> empNames;

    @ApiModelProperty(value = "工位状态 忙碌：busy 空闲：free")
    private String stationStatus ="free";
}
