package com.mrpeng.config.model.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 工单单身对象
 * @author: pqq
 * @create: 2021-01-28 15:45
 **/
@Data
public class MoDDTO {
    @TableField("SequenceNumber")
    private Integer SequenceNumber;

    @ApiModelProperty(value = "主键")
    private String moDId;

    @ApiModelProperty(value = "材料品名")
    private String itemDescription;

    @ApiModelProperty(value = "材料规格")
    private String itemSpecification;

    @ApiModelProperty(value = "取替代料")
    private String replaceItem;

    @ApiModelProperty(value = "上阶主件品号")
    private String upLevelItemId;

    @ApiModelProperty(value = "被取替代品号")
    private String replacedItemId;

    @ApiModelProperty(value = "被取替代特征码")
    private String replacedItemFeatureId;

    @ApiModelProperty(value = "预计用量")
    private Double requiredQty;

    @ApiModelProperty(value = "需领用量")
    private Double requIncludeMultQty;

    @ApiModelProperty(value = "被取替代数量")
    private Double replacedQty;

    @ApiModelProperty(value = "已领用量")
    private Double issuedQty;

    @ApiModelProperty(value = "供料方式")
    private String itemType;

    @ApiModelProperty(value = "供料方式_02")
    private String itemType02;

    @ApiModelProperty(value = "预计领料日期")
    private String planIssueDate;

    @ApiModelProperty(value = "实际领料日期")
    private String actualIssueDate;

    @ApiModelProperty(value = "超领率")
    private Double issueOverrunRate;

    @ApiModelProperty(value = "物料领料状态（0,未领料;1,已领料）")
    private String udf021;

    @ApiModelProperty(value = "物料位置")
    private String udf022;

    @ApiModelProperty(value = "物料出库状态")
    private String udf023;

    @ApiModelProperty(value = "缺领率")
    private Double issueShortageRate;

    @ApiModelProperty(value = "上阶主件特征码")
    private String upLevelItemFeatureId;

    @ApiModelProperty(value = "投料间距")
    private Integer issueMaterialPeriod;

    @ApiModelProperty(value = "元件群组")
    private String itemGroup;

    @ApiModelProperty(value = "替代群组")
    private String replaceGroup;

    @ApiModelProperty(value = "材料品号")
    private String itemId;

    @ApiModelProperty(value = "单位")
    private String unitId;

    @ApiModelProperty(value = "特征码")
    private String itemFeatureId;

    @ApiModelProperty(value = "工艺")
    private String operationId;

    @ApiModelProperty(value = "仓库")
    private String warehouseId;

    @ApiModelProperty(value = "库位")
    private String binId;

    @ApiModelProperty(value = "批号")
    private String itemLotId;

    @ApiModelProperty(value = "需领用量第二数量")
    private Double requiredSecondQty;

    @ApiModelProperty(value = "已领用量第二数量")
    private Double issuedSecondQty;

    @ApiModelProperty(value = "已申请量")
    private Double issuedReqQty;

    @ApiModelProperty(value = "已申请第二数量")
    private Double issuedReqSecondQty;

    @ApiModelProperty(value = "工单材料图片")
    private String moDPic;

    @ApiModelProperty(value = "项目")
    private String projectId;

    @ApiModelProperty(value = "最低用量")
    private Double leastRequiredQty;

    @ApiModelProperty(value = "插件位置")
    private String componentLocation;

    @ApiModelProperty(value = "调拨数量")
    private Double transferQty;

    private String moRoutingDId;

    private Boolean notMoMaterail;

    @ApiModelProperty(value = "版本号，不要随意更改")
    private String Version;


    private String moId;

}
