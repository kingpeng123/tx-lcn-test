package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ApiModel("工位员工对象")
@AllArgsConstructor
@NoArgsConstructor
public class StationVO {
    @ApiModelProperty(value = "工位ID")
    private String stationId;

    @ApiModelProperty(value = "工位编号")
    private String stationNo;

    @ApiModelProperty(value = "员工姓名")
    private String empName;

    @ApiModelProperty(value = "员工ID")
    private String empId;

    @ApiModelProperty(value = "待办任务量")
    private Integer needTask =0;

    @ApiModelProperty(value = "预计总工时")
    private Integer estimateHour =0;

}
