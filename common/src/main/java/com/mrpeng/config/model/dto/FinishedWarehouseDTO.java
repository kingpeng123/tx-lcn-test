package com.mrpeng.config.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 工单完工入库条件对象库存
 * @author: pqq
 * @create: 2021-03-10 10:17
 **/
@ApiModel(description = "工单完工入库条件对象")
@Data
public class FinishedWarehouseDTO extends SaveReceiptDTO {

    @ApiModelProperty(value = "修改库存信息对象集合")
    @NotEmpty(message = "条件集合不能为空")
    private List<ModifiedInventoryDTO> modifiedInventories;

}
