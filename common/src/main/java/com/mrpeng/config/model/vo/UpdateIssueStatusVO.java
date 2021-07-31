package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 修改领料单对象
 * @author: pqq
 * @create: 2021-02-19 14:46
 **/
@ApiModel(description = "修改领料单对象")
@Data
public class UpdateIssueStatusVO {
    @ApiModelProperty(value = "领料单状态")
    @NotBlank(message = "领料单状态不能为空")
    private String status;

    @ApiModelProperty(value = "工单主键")
    @NotBlank(message = "工单主键不能为空")
    private String moId;

    @ApiModelProperty(value = "工单物料主键")
    @NotNull(message = "物料主键不能为空")
    private List<String> moDId;

    @ApiModelProperty(value = "用户Id")
    @NotBlank(message = "用户ID不能为空")
    private String userId;

    @ApiModelProperty(value = "部门Id")
//    @NotBlank(message = "部门ID不能为空")
    private String deptId;

    @ApiModelProperty(value = "领料单主键")
    @NotBlank(message = "领料单主键不能为空")
    private String issueReceiptId;

    @ApiModelProperty(value = "领料单物料状态")
    @NotBlank(message = "领料单物料状态不能为空")
    private String ApproveStatus;
}
