package com.mrpeng.config.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 生成生产入库单对象
 * @author: pqq
 * @create: 2021-02-09 15:46
 **/
@Data
@ApiModel(description = "生成生产入库单对象")
public class SaveReceiptDTO {
    @ApiModelProperty(value = "用户ID")
    @NotBlank(message = "用户Id不能为空")
    private String userId;

    @ApiModelProperty(value = "部门ID")
    private String deptId;

    @ApiModelProperty(value = "工单主键")
    @NotBlank(message = "工单主键不能为空")
    private String moId;

    @ApiModelProperty(value = "工位ID")
    private String stationId;

    @ApiModelProperty(value = "入库数量")
    private Double receiptQuantity;

    @ApiModelProperty(value = "单据单号")
//    private Map<String,Object> serialNumberMap;
    private String serialNumber;

    @ApiModelProperty(value = "工作中心ID")
    private String workCenter;

    @ApiModelProperty(value = "销售单号")
    private String SalesOrderDoc;

    @ApiModelProperty(value = "工作台ID")
    private String workCenterRtk;
}
