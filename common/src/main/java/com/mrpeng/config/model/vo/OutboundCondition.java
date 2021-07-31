package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 出库单条件
 * @author: pqq
 * @create: 2021-02-05 08:56
 **/
@Data
@ApiModel(description = "出库单搜索条件")
public class OutboundCondition {

    @ApiModelProperty(value = "搜索条件")
    private String criteria;

    @ApiModelProperty(value = "工单号")
    private String docNo;

    @ApiModelProperty(value = "领料出库单主键")
    private String pickOutboundId;

    @ApiModelProperty(value = "出库单状态")
    private String status;

    @ApiModelProperty(value = "工号")
    private String jobNum;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "每页大小")
    private Integer pageSize;

    @ApiModelProperty(value = "当前页")
    private Integer curPage;

    @ApiModelProperty(value = "开始时间")
    private String startDate;

    @ApiModelProperty(value = "结束时间")
    private String endDate;

}
