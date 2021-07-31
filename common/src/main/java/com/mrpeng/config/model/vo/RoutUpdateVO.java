package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author: pqq
 * @create: 2021-01-27 13:39
 **/
@Data
@ApiModel(description = "工艺修改对象")
public class RoutUpdateVO {

    @ApiModelProperty(value = "工单主键")
    private String moId;

    @ApiModelProperty(value = "工艺单身主键")
    @NotNull(message = "工艺单身主键不能为空")
    private String moRoutingDId;

    @ApiModelProperty(value = "工艺状态")
    @NotNull(message = "工艺状态不能为空")
    private String status;

    @ApiModelProperty(value = "工艺状态")
    private Boolean workable;

    @ApiModelProperty(value = "当前用户")
    @NotNull(message = "当前用户ID不能为空")
    private String userId;

    @ApiModelProperty(value = "当前用户部门")
    private String deptId;

    @ApiModelProperty(value = "下一道工序的ID",hidden = true)
    private String toMoRoutingDId;

    @ApiModelProperty(value = "工单物料ID集合")
    private List<String> moDIds;

    @ApiModelProperty(value = "工位ID")
    private String stationId;
}
