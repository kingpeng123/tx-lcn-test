package com.mrpeng.config.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "工单工艺单身")
public class  MoCraftBodyVO {

    @ApiModelProperty(value = "主键")
    private String moRoutingDId;

    @ApiModelProperty(value = "工单号")
    private String docNo;

    @ApiModelProperty(value = "工单主键")
    private String moId;

    @ApiModelProperty(value = "品名")
    private String itemDescription;

    @ApiModelProperty(value = "工艺ID")
    private String operationId;

    @ApiModelProperty(value = "工艺编码")
    private String operationCode;

    @ApiModelProperty(value = "工序")
    private String operationSeq;

    @ApiModelProperty(value = "工艺名称")
    private String operationName;

    @ApiModelProperty(value = "性质 1.厂内 2.委外 3.二者都有")
    private String character;

    @ApiModelProperty(value = "标准人时(秒)")
    private Integer standardManHour;

    @ApiModelProperty(value = "实际人时(秒)")
    private Integer actManHours;

    @ApiModelProperty(value = "实际开工日期")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date actStartDate;

    @ApiModelProperty(value = "实际完工日期")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date actCompleteDate;

    @ApiModelProperty(value = "预计开工日期")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date planStartDate;

    @ApiModelProperty(value = "预计完工日期")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date planCompleteDate;

    @ApiModelProperty(value = "工艺说明")
    private String operationComment;

    @ApiModelProperty(value = "工艺状态（0,不可开工;1,可开工;2,加工中,3暂停中;4,完工;5,质检不通过;6.质检通过,7质检中）")
    private String routStatus;

    @ApiModelProperty(value = "工艺关联工位ID")
    private String stationId;

    @ApiModelProperty(value = "工位编号")
    private String stationNo;

    @ApiModelProperty(value = "工艺关联工人")
    private String empName;

    @ApiModelProperty(value = "工人ID")
    private String employeeId;

    @ApiModelProperty(value = "关联设备")
    private String equipment;

    @ApiModelProperty(value = "最后工作者")
    private Boolean lastWork;

    @ApiModelProperty(value = "是否自领料")
    private Boolean selfPick;

    @ApiModelProperty(value = "可进行")
    private Boolean workable;

    @ApiModelProperty(value = "工作时间")
    private Long workDate;

    @ApiModelProperty(value = "工艺备注")
    private String remark;

}
