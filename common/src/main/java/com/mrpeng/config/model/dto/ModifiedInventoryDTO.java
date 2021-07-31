package com.mrpeng.config.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 修改库存对象
 * @author: pqq
 * @create: 2021-03-09 10:04
 **/
@ApiModel(description = "库存修改对象")
@Data
public class ModifiedInventoryDTO {
    @ApiModelProperty(value = "产品品号")
    @NotBlank(message = "产品品名不能为空")
    private String itemId;

    @ApiModelProperty(value = "修改类型 增加：increase，减少：reduce")
    @NotBlank(message = "修改类型不能为空")
    private String type;

    @ApiModelProperty(value = "修改数量")
    @NotNull(message = "修改数量不能为空")
    private Double quantity;

    @ApiModelProperty(value = "修改人员")
    private String userId;

    @ApiModelProperty(value = "产品批号")
    private String itemLotId;

    @ApiModelProperty(value = "仓库ID")
    private String warehouseId;
}
