package com.mrpeng.config.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 采购到货单头部信息视图对象
 * @author: pqq
 * @create: 2021-02-20 09:39
 **/
@Data
@ApiModel(description = "采购到货单头部视图对象")
public class PurchaseArrivalHeadVO {
    @ApiModelProperty(value = "到货单号")
    private String purchaseArrivalDoc;

    @ApiModelProperty(value = "到货单主键")
    private String purchaseArrivalId;

    @ApiModelProperty(value = "采购单号")
    private String purchaseOrderDoc;

    @ApiModelProperty(value = "采购单主键")
    private String purchaseOrderId;

    @ApiModelProperty(value = "单据类型")
    private String docCode;

    @ApiModelProperty(value = "单据类型名称")
    private String docName;

    @ApiModelProperty(value = "到货单状态")
    private String purchaseArrivalStatus;

    @ApiModelProperty(value = "单据日期(任务时间)")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date docDate;

    @ApiModelProperty(value = "到货时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date arrivalDate;

    @ApiModelProperty(value = "收货机构")
    private String plantName;

    @ApiModelProperty(value = "供应商全称")
    private String supplierFullName;

    @ApiModelProperty(value = "采购员")
    private String purchaseEmp;

    @ApiModelProperty(value = "采购部门")
    private String purchaseDept;

    @ApiModelProperty(value = "原币未税金额")
    private Double amountUnincludeTaxOc;

    @ApiModelProperty(value = "原币税额")
    private Double taxOc;

    @ApiModelProperty(value = "合计金额(未税金额+税额)")
    private Double amountTotal;

    @ApiModelProperty(value = "备注")
    private String remark;
}
