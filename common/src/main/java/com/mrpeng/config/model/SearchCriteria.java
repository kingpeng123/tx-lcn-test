package com.mrpeng.config.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: pqq
 * @create: 2020-12-30 12:04
 **/
@Data
@ApiModel(value = "SearchCriteria",description = "搜索条件对象")
public class SearchCriteria {

    @ApiModelProperty(value = "搜索条件")
    private String criteria;

    @ApiModelProperty(value = "工单号")
    private String docNo;

    @ApiModelProperty(value = "工号")
    private String jobNum;

    @ApiModelProperty(value = "工单类型 511 常规工单 512 紧急工单 513 委外工单 531 重工工单")
    private String moType;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "工单状态，1未配料，2已配料，3已派工，4已发料，5生产中，Y完工，y指定完工,NO_ASSIGNED未派工,WORK_ASSIGNED已派工后状态,WORKED完工")
    private String status;

    @ApiModelProperty(value = "工艺状态（0,不可开工;1,可开工;2,加工中,3暂停中;4,完工;5,质检不通过;6.质检通过,7质检中,NO_WORK未开工,WORKING 加工中,WORKED 完工后所有数据,INSPECT质检数据）")
    private String routStatus;

    @ApiModelProperty(value = "工单是否加急")
    private String isUrgent;

    @ApiModelProperty(value = "生产车间条件 (全部:0,生产车间:1，焊接车间:2)")
    private String workShop;

    @ApiModelProperty(value = "角色Id")
    private String roleId;

    @ApiModelProperty(value = "员工姓名")
    private String empName;

    @ApiModelProperty(value = "工位Id")
    private String stationId;

    @ApiModelProperty(value = "工艺")
    private String operationName;

    @ApiModelProperty(value = "每页大小")
    private Integer pageSize;

    @ApiModelProperty(value = "当前页")
    private Integer curPage;

    @ApiModelProperty(value = "任务状态")
    private String taskStatus;

    @ApiModelProperty(value = "开始时间")
    private String startDate;

    @ApiModelProperty(value = "结束时间")
    private String endDate;
}
