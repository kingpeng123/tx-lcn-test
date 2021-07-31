package com.mrpeng.config.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 生成到货质检单对象
 * @author: pqq
 * @create: 2021-02-23 08:58
 **/
@ApiModel(description = "生成到货质检单对象")
@Data
public class SavePoArrivalInspectDTO {

    @ApiModelProperty(value = "送检人员",required = true)
    @NotBlank(message = "送检人员不能为空")
    private String submitEmp;

    @ApiModelProperty(value = "送检部门",required = true)
    @NotBlank(message = "送检部门不能为空")
    private String submitDept;

    @ApiModelProperty(value = "质检人员",required = true)
    @NotBlank(message = "质检人员不能为空")
    private String inspectionEmp;

    @ApiModelProperty(value = "质检部门",required = true)
    @NotBlank(message = "质检部门不能为空")
    private String inspectionDept;

    @ApiModelProperty(value = "到货单主键",required = true)
    @NotBlank(message = "到货单主键不能为空")
    private String purchaseArrivalId;

    @ApiModelProperty(value = "备注")
    private String remark;

}
