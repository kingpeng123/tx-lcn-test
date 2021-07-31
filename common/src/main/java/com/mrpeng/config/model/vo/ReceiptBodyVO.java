package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: pqq
 * @create: 2021-01-06 17:05
 **/
@Data
@ApiModel(description = "入库详情身体信息")
public class ReceiptBodyVO {

    @ApiModelProperty(value = "工艺名称")
    private String operationName;

    @ApiModelProperty(value = "工艺名称")
    private String operationCode;

    @ApiModelProperty(value = "工位编号")
    private String stationCode;

    @ApiModelProperty(value = "区域编号")
    private String areaCode;

    @ApiModelProperty(value = "入库员工（入库完成）")
    private String receiptEmp;

    @ApiModelProperty(value = "入库仓库（入库完成）")
    private String warehouseName;
}
