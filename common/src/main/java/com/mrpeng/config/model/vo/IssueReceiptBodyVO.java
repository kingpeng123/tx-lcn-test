package com.mrpeng.config.model.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 领料单单身信息
 * @author: pqq
 * @create: 2021-01-08 13:06
 **/
@Data
@ApiModel(description = "领料单单身信息")
public class IssueReceiptBodyVO {
    @TableField("SequenceNumber")
    private Integer SequenceNumber;

    @ApiModelProperty(value = "领料单单身主键")
    private String issueReceiptDId;

    @ApiModelProperty(value = "领料单主键")
    private String issueReceiptId;

    @ApiModelProperty(value = "材料品名")
    private String itemDescription;

    @ApiModelProperty(value = "材料规格")
    private String itemSpecification;

    @ApiModelProperty(value = "材料描述")
    private String itemRemark;

    @ApiModelProperty(value = "材料品号")
    private String itemCode;

    @ApiModelProperty(value = "供料方式" +
            "1.厂内供料" +
            "3.供货商供料" +
            "5.客户供料" +
            "4.不发料" +
            "0.全部")
    private String itemType;

    @ApiModelProperty(value = "领退料数量")
    private Double issueReceiptQty;

    @ApiModelProperty(value = "单位")
    private String unitName;

    @ApiModelProperty(value = "仓库")
    private String warehouseName;

    @ApiModelProperty(value = "物料位置")
    private String location;

    @ApiModelProperty(value = "工单物料主键")
    private String moDId;

    @ApiModelProperty(value = "单据状态属性 N未完成 A质检中 Y完成")
    private String ApproveStatus;
}
