package com.mrpeng.config.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * controller参数对象
 */
@Data
@ApiModel(value = "工单条件对象")
public class MoCondition {


    @ApiModelProperty(value = "工单号")
    private String docNo;

    @ApiModelProperty(value = "工号")
    private String jobNum;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "工单状态（2未生产，3已派工，4已发料，5生产中，Y完工，y指定完工）")
    private String status;

    @ApiModelProperty(value = "角色Id")
    private String roleId;

    @ApiModelProperty(value = "员工姓名")
    private String empName;

    @ApiModelProperty(value = "工位")
    private String station;

    @ApiModelProperty(value = "工艺")
    private String operationName;

    @ApiModelProperty(value = "每页大小")
    private Integer pageSize;

    @ApiModelProperty(value = "当前页")
    private Integer curPage;

    @ApiModelProperty(value = "开始时间")
    private String startDate;

    @ApiModelProperty(value = "结束时间")
    private String endDate;
}
