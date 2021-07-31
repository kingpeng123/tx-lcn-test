package com.mrpeng.config.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author pengquan
 * @version 1.0
 * @classname GenerateReceipt
 * @description erp生成入库单中间对象
 * @date 2021/6/25 12:32
 **/
@ApiModel(description = "erp生成入库单传递对象")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenerateReceiptDTO {

    @ApiModelProperty(value = "入库单对象")
    @NotNull(message = "入库单对象不能为空")
    private MoReceiptDTO moReceipt;

    @ApiModelProperty(value = "入库单详情对象")
    @NotNull(message = "入库单详情对象不能为空")
    private MoReceiptDDTO moReceiptD;
}
