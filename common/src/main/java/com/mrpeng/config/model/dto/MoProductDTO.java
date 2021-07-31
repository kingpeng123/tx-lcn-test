package com.mrpeng.config.model.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 工单产出信息转递对象
 * @author: pqq
 * @create: 2021-03-10 10:55
 **/
@Data
public class MoProductDTO{
    @TableField("SequenceNumber")
    private Integer SequenceNumber;

    @ApiModelProperty(value = "主键")
    @TableId(value = "MO_PRODUCT_ID", type = IdType.ASSIGN_ID)
    private String moProductId;

    @TableField("ITEM_DESCRIPTION")
    private String itemDescription;

    @TableField("ITEM_SPECIFICATION")
    private String itemSpecification;

    @ApiModelProperty(value = "品号")
    @TableField("ITEM_ID")
    private String itemId;

    @ApiModelProperty(value = "特征码")
    @TableField("ITEM_FEATURE_ID")
    private String itemFeatureId;

    @ApiModelProperty(value = "库存单位")
    @TableField("UNIT_ID")
    private String unitId;

    @ApiModelProperty(value = "产出类型")
    @TableField("PRODUCT_TYPE")
    private String productType;

    @ApiModelProperty(value = "产出比例")
    @TableField("PER_QTY")
    private Double perQty;

    @ApiModelProperty(value = "预计产量")
    @TableField("PLAN_QTY")
    private Double planQty;

    @ApiModelProperty(value = "入库申请数量")
    @TableField("REQ_QTY")
    private Double reqQty;

    @ApiModelProperty(value = "入库数量")
    @TableField("COMPLETED_QTY")
    private Double completedQty;

    @ApiModelProperty(value = "备注")
    @TableField("REMARK")
    private String remark;

    @ApiModelProperty(value = "报废数量")
    @TableField("SCRAP_QTY")
    private Double scrapQty;

    @ApiModelProperty(value = "破坏数量")
    @TableField("DESTROYED_QTY")
    private Double destroyedQty;

    @ApiModelProperty(value = "预计产量第二数量")
    @TableField("PLAN_SECOND_QTY")
    private Double planSecondQty;

    @ApiModelProperty(value = "入库申请第二数量")
    @TableField("REQ_SECOND_QTY")
    private Double reqSecondQty;

    @ApiModelProperty(value = "已入库第二数量")
    @TableField("COMPLETED_SECOND_QTY")
    private Double completedSecondQty;

    @ApiModelProperty(value = "报废第二数量")
    @TableField("SCRAP_SECOND_QTY")
    private Double scrapSecondQty;

    @ApiModelProperty(value = "破坏第二数量")
    @TableField("DESTROYED_SECOND_QTY")
    private Double destroyedSecondQty;

    @ApiModelProperty(value = "入库仓库")
    @TableField("WAREHOUSE_ID")
    private String warehouseId;

    @ApiModelProperty(value = "版本号，不要随意更改")
    @TableField("Version")
    private String Version;

    @ApiModelProperty(value = "创建日期")
    @TableField("CreateDate")
    private String CreateDate;

    @ApiModelProperty(value = "最后修改日期")
    @TableField("LastModifiedDate")
    private String LastModifiedDate;

    @ApiModelProperty(value = "修改日期")
    @TableField("ModifiedDate")
    private String ModifiedDate;

    @ApiModelProperty(value = "创建者")
    @TableField("CreateBy")
    private String CreateBy;

    @ApiModelProperty(value = "最后修改者")
    @TableField("LastModifiedBy")
    private String LastModifiedBy;

    @ApiModelProperty(value = "修改者")
    @TableField("ModifiedBy")
    private String ModifiedBy;

    @ApiModelProperty(value = "单据状态属性")
    @TableField("ApproveStatus")
    private String ApproveStatus;

    @ApiModelProperty(value = "修改日期")
    @TableField("ApproveDate")
    private String ApproveDate;

    @ApiModelProperty(value = "修改人")
    @TableField("ApproveBy")
    private String ApproveBy;

    @ApiModelProperty(value = "自定义字段0")
    @TableField("UDF001")
    private Double udf001;

    @ApiModelProperty(value = "自定义字段1")
    @TableField("UDF002")
    private Double udf002;

    @ApiModelProperty(value = "自定义字段2")
    @TableField("UDF003")
    private Double udf003;

    @ApiModelProperty(value = "自定义字段3")
    @TableField("UDF011")
    private Double udf011;

    @ApiModelProperty(value = "自定义字段4")
    @TableField("UDF012")
    private Double udf012;

    @ApiModelProperty(value = "自定义字段5")
    @TableField("UDF013")
    private Double udf013;

    @ApiModelProperty(value = "自定义字段6")
    @TableField("UDF021")
    private String udf021;

    @ApiModelProperty(value = "自定义字段7")
    @TableField("UDF022")
    private String udf022;

    @ApiModelProperty(value = "自定义字段8")
    @TableField("UDF023")
    private String udf023;

    @ApiModelProperty(value = "自定义字段9")
    @TableField("UDF024")
    private String udf024;

    @ApiModelProperty(value = "自定义字段10")
    @TableField("UDF025")
    private String udf025;

    @ApiModelProperty(value = "自定义字段11")
    @TableField("UDF026")
    private String udf026;

    @ApiModelProperty(value = "自定义字段12")
    @TableField("UDF041")
    private String udf041;

    @ApiModelProperty(value = "自定义字段13")
    @TableField("UDF042")
    private String udf042;

    @ApiModelProperty(value = "自定义字段14")
    @TableField("UDF051")
    private String udf051;

    @ApiModelProperty(value = "自定义字段15")
    @TableField("UDF052")
    private String udf052;

    @ApiModelProperty(value = "自定义字段16")
    @TableField("UDF053")
    private String udf053;

    @ApiModelProperty(value = "自定义字段17")
    @TableField("UDF054")
    private String udf054;

    @TableField("MO_ID")
    private String moId;
}
