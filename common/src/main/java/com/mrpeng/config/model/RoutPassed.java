package com.mrpeng.config.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 工艺质检通过条件对象
 * @author: pqq
 * @create: 2021-03-11 09:03
 **/
@Data
public class RoutPassed {
    @NotBlank(message = "工单主键ID不能为空")
    private String moId;
    @NotBlank(message = "工艺主键ID")
    private String moRoutingDId;
    @NotBlank(message = "用户ID不能为空")
    private String userId;
    @NotBlank(message = "用户部门ID不能为空")
    private String deptId;
    @NotNull(message = "通过数量不能为空")
    private Double passQuantity;
}
