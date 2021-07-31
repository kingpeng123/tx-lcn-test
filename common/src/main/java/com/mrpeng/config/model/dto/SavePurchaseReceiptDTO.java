package com.mrpeng.config.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 生成采购入库单对象
 * @author: pqq
 * @create: 2021-02-24 08:59
 **/
@Data
@ApiModel(description = "生成采购入库单对象")
public class SavePurchaseReceiptDTO {

    @ApiModelProperty(value = "用户ID",required = true)
    @NotBlank(message = "用户ID不能为空")
    private String userId;

    @ApiModelProperty(value = "用户部门ID",required = true)
    @NotBlank(message = "用户部门ID不能为空")
    private String deptId;

    @ApiModelProperty(value = "采购到货单主键",required = true)
    @NotBlank(message = "采购到货单主键不能为空")
    private String purchaseArrivalId;

    @ApiModelProperty(value = "备注")
    private String remark;


}
