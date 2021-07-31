package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 待办任务请求条件
 * @author: pqq
 * @create: 2021-01-16 13:39
 **/
@Data
@ApiModel("待办任务条件对象")
public class NeedTaskApply {

    @ApiModelProperty(value = "当前页",required = true)
    private Integer curPage;

    @ApiModelProperty(value = "每页大小",required = true)
    private Integer pageSize;

    @ApiModelProperty(value = "开始时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String startDate;

    @ApiModelProperty(value = "结束时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String endDate;

    @ApiModelProperty(value = "任务类型:默认为all",required = true)
    private String taskType;

    @ApiModelProperty(value = "任务状态：DEFAULT(默认),NO_ACCEPT(未接受),NO_WORK,未进行;WORKING,正在进行；WORKED 完工",required = true)
    private String taskStatus;

    @ApiModelProperty(value = "搜索条件")
    private String criteria;

    @ApiModelProperty(value = "当前用户ID")
    private String userId;

}
