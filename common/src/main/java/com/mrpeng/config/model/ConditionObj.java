package com.mrpeng.config.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *
 * @author: pqq
 * @create: 2021-02-08 13:54
 **/
@Data
@ApiModel(description = "条件对象")
public class ConditionObj {

    @ApiModelProperty(value = "搜索条件")
    private String criteria;

    @ApiModelProperty(value = "开始时间")
    private String startDate;

    @ApiModelProperty(value = "结束时间")
    private String endDate;

    @ApiModelProperty(value = "任务状态")
    private String taskStatus;

    @ApiModelProperty(value = "任务类型")
    private String taskType;

    @ApiModelProperty(value = "用户ID")
    private  String userId;

    @ApiModelProperty(value = "单据主键")
    private String id;

}
