package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author: pqq
 * @create: 2021-01-04 13:40
 **/
@Data
@ApiModel("配料单详情")
public class IngredientDetailVO {

    @ApiModelProperty(value = "配料单单头信息")
    private IngredientsHeadVO ingredientsHead;

    @ApiModelProperty(value = "配料单详细列表")
    private List<MoMaterialVO> moMaterials;

}
