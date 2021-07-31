package com.mrpeng.config.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 采购到货质检单
 * @author: pqq
 * @create: 2021-02-07 16:29
 **/
@Data
@ApiModel(description = "采购到货质检单单头视图")
public class PoArrivalInspectionHeadVO {

    @ApiModelProperty(value = "采购到货质检单号")
    private String poArrivalInspectionDoc;

    @ApiModelProperty(value = "采购到货单质检单主键")
    private String poArrivalInspectionId;

    @ApiModelProperty(value = "单据日期(任务时间)")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date docDate;

    @ApiModelProperty(value = "单据类型名称")
    private String docName;

    @ApiModelProperty(value = "单据类型编号")
    private String docCode;

    @ApiModelProperty(value = "采购到货单主键")
    private String purchaseArrivalId;

    @ApiModelProperty(value = "采购到货单单号")
    private String purchaseArrivalDoc;

    @ApiModelProperty(value = "到货日期")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date arrivalDate;

    @ApiModelProperty(value = "供应商全称")
    private String supplierFullName;

    @ApiModelProperty(value = "供应商")
    private String supplierId;

    @ApiModelProperty(value = "判定结果1合格，2不合格")
    private String decision;

    @ApiModelProperty(value = "业务判定状态：1未判定，2部分判定，3已判定")
    private String resultStatus;

    @ApiModelProperty(value = "备注")
    private String remark;


}
