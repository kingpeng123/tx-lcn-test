package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 领料对象
 * @author: pqq
 * @create: 2021-01-27 17:07
 **/
@Data
@ApiModel(description = "领料对象")
public class PickingVO {

    @ApiModelProperty(value = "当前用户")
    @NotBlank(message = "当前用户ID不能为空")
    private String userId;

    @ApiModelProperty(value = "用户部门")
    private String deptId;

    @ApiModelProperty(value = "工单主键")
    private String moId;

    @ApiModelProperty(value = "领料单主键")
    private String issueReceiptId;

    @ApiModelProperty(value = "角色ID")
    private String roleId;

    @ApiModelProperty(value = "工艺单身ID")
    private String moRoutingDId;

    @ApiModelProperty(value = "物料主键集合")
    @NotNull(message = "物料主键ID不能为空")
    private List<String> moDIds;

    @ApiModelProperty(value = "物料领料状态")
    private String ApproveStatus;
}
