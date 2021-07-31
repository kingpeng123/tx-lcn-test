package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: pqq
 * @create: 2021-01-06 17:06
 **/
@Data
@ApiModel("入库单详细信息对象")
public class ReceiptDetailVO {
    @ApiModelProperty(value = "入库单单头")
    ReceiptHeadVO receiptHead;

    @ApiModelProperty(value = "入库单单身信息")
    ReceiptBodyVO receiptBody;
}
