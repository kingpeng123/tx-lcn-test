package com.mrpeng.config.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author: pqq
 * @create: 2021-01-18 16:16
 **/
@Data
@ApiModel(description = "物流单单头信息视图")
public class TransportHeadVO {
    @ApiModelProperty(value = "物流单号")
    private String transportNo;

    @ApiModelProperty(value = "物流单主键")
    private String transportId;

    @ApiModelProperty(value = "关联工单ID")
    private String moId;

    @ApiModelProperty(value = "关联工单号")
    private String docNo;

    @ApiModelProperty(value = "产品品号")
    private String itemCode;

    @ApiModelProperty(value = "产品品名")
    private String itemDescription;

    @ApiModelProperty(value = "产品规格")
    private String itemSpecification;

    @ApiModelProperty(value = "需求产量")
    private Double planQty;

    @ApiModelProperty(value = "单位")
    private String unitName;

    @ApiModelProperty(value = "单据类型编号")
    private String docCode;

    @ApiModelProperty(value = "单据类型名称")
    private String docName;

    @ApiModelProperty(value = "工单是否加急")
    private Boolean urgent;

    @ApiModelProperty(value = "单据开始时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date actualStartDate;

    @ApiModelProperty(value = "单据结束时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date actualCompleteDate;

    @ApiModelProperty(value = "物流类型(1,领料物流单,2,转移物流单,3.辅料物流单,4.入库物流单)")
    private String transportType;

    @ApiModelProperty(value = "单据时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date docDate;

    @ApiModelProperty(value = "关联部门")
    private String adminUnitName;

    @ApiModelProperty(value = "关联工人")
    private String empName;

    @ApiModelProperty(value = "派工部门")
    private String deptName;

    @ApiModelProperty(value = "关联领料出库单")
    private String pickOutboundId;

    @ApiModelProperty(value = "预计开工日期")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date planStartDate;

    @ApiModelProperty(value = "预计完工日期")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date planCompleteDate;

    @ApiModelProperty(value = "物流单状态（0,未接受,1,未进行;2,进行中;3,已完成;4.审核中）")
    private Integer status;

    @ApiModelProperty(value = "领料日期")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date pickDate;

    @ApiModelProperty(value = "物料起始位置")
    private String startPosition;

    @ApiModelProperty(value = "物料目标位置")
    private String targetPosition;

    @ApiModelProperty(value = "仓库名字")
    private String warehouseName;

    @ApiModelProperty(value = " 累计时长")
    private Double cumulativeDuration;

    @ApiModelProperty(value = "运输工人ID")
    private String ownerEmp;

    @ApiModelProperty(value = "备注")
    private String remark;

}

