package com.mrpeng.config.model.vo;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@ApiModel(description = "工单头信息对象/工单工艺单头信息")
public class MoHeadInfoVO {

    @ApiModelProperty(value = "单号")
    private String docNo;

    @ApiModelProperty(value = "工单主键")
    private String moId;

    @ApiModelProperty(value = "产品品名")
    private String itemDescription;

    @ApiModelProperty(value = "产品规格")
    private String itemSpecification;

    @ApiModelProperty(value = "预计产量")
    private Double planQty;

    @ApiModelProperty(value = "品号")
    private String itemCode;

    @ApiModelProperty(value = "生产部门")
    private String adminUnitName;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "领料单主键")
    private String issueReceiptId;

    @ApiModelProperty(value = "领料单状态")
    private String issueReceiptStatus;

    @ApiModelProperty(value = "预计开工日期")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date planStartDate;

    @ApiModelProperty(value = "预计完工日期")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date planCompleteDate;

    @ApiModelProperty(value = "实际开工日期")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date actualStartDate;

    @ApiModelProperty(value = "实际完工日期")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date actualCompleteDate;

    @ApiModelProperty(value = "需求单号")
    private String demandNo;

    @ApiModelProperty(value = "物料描述")
    private String itemRemark;

    @ApiModelProperty(value = "工号")
    private String udf021;

    @ApiModelProperty(value = "用户")
    private String udf022;

    @ApiModelProperty(value = "客户")
    private String customerName;

    @ApiModelProperty(value = "单位")
    private String unitName;

    @ApiModelProperty(value = "销售订单号")
    private String salesOrderDoc;

    @ApiModelProperty(value = "销售订单物料ID")
    private String salesOrderDocDId;

    @ApiModelProperty(value = "订单时间")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date orderDate;

    @ApiModelProperty(value = "订单类型名")
    private String docName;

    @ApiModelProperty(value = "规格表述")
    private String specificationDes;

    @ApiModelProperty(value = "工单状态码（1未配料，2已配料，3已派工，4已发料，5生产中，Y完工，y指定完工")
    private String status;

    @ApiModelProperty(value = "加工工艺ID")
    private String moRoutingDId;

    @ApiModelProperty(value = "正在生产的工艺编号")
    private String operationCode;

    @ApiModelProperty(value = "正在生产的工艺名称")
    private String operationName;

    @ApiModelProperty(value = "正在生产工艺的状态（工艺状态（0,不可开工;1,可开工;2,加工中,3暂停中;4,完工;5,质检通过;））")
    private String routStatus;

    @ApiModelProperty(value = "工单生产人员")
    private List<String> empName;

    @ApiModelProperty("工单锁定")
    private Integer moLock;

    @ApiModelProperty(value = "工位编号")
    private String stationNo;

    @ApiModelProperty(value = "工单是否加急(true 加急 false 不加急)")
    private Boolean urgent;

}
