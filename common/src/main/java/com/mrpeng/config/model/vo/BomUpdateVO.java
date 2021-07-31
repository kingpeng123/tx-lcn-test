package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 修改物料状态条件对象
 * @author: pqq
 * @create: 2021-01-28 11:15
 **/
@Data
@ApiModel(description = "修改物料状态条件对象")
public class BomUpdateVO {
    @ApiModelProperty(value = "用户ID")
    @NotBlank(message = "用户ID不能为空")
    private String userId;

    @ApiModelProperty(value = "部门ID")
    private String deptId;

    @ApiModelProperty(value = "工单物料状态")
    private Integer bomStatus;

    @ApiModelProperty(value = "工单领料状态")
    private String pickStatus;

    @ApiModelProperty(value = "工单物料出库状态")
    private String outboundStatus;

    @ApiModelProperty(value = "工单主键")
    private String moId;

    @ApiModelProperty(value = "物料主键集合")
    @NotEmpty(message = "物料主键不能为空")
    private List<String> moDIds;

    @ApiModelProperty(value = "物料位置")
    private String location;

    @ApiModelProperty(value = "是否自动配料")
    private Boolean isAutoIngredients =false;


}
