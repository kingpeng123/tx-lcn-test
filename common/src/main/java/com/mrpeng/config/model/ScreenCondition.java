package com.mrpeng.config.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 筛选条件
 * @author: pqq
 * @create: 2021-01-26 07:56
 **/
@Data
@ApiModel(description = "筛选条件")
public class ScreenCondition {
    @ApiModelProperty(value = "当前页",dataType = "int")
    @NotNull(message = "分页参数不能为空")
    private Integer curPage;

    @ApiModelProperty(value = "每页大小",dataType = "int")
    @NotNull(message = "分页参数不能为空")
    private Integer pageSize;

    @ApiModelProperty(value = "开始时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String startDate;

    @ApiModelProperty(value = "结束时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String endDate;

    @ApiModelProperty(value = "任务类型,默认为all，领料物流；ISSUE,工序转移：TRANSFER,入库物流；RECEIPT,辅料物流；ACCESSORIES")
    @NotBlank(message = "任务类型不能为空")
    private String taskType;

    @ApiModelProperty(value = "任务状态,WORKING进行中，WORKED 完成")
    @NotBlank(message = "任务状态不能为空")
    private String taskStatus;

    @ApiModelProperty(value = "当前用户ID",dataType = "String")
    @NotBlank(message = "当前用户ID不能为空")
    private String userId;

    @ApiModelProperty(value = "搜索条件")
    private String criteria;

}
