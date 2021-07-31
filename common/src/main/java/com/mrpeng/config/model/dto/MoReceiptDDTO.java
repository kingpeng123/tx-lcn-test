package com.mrpeng.config.model.dto;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author pengquan
 * @version 1.0
 * @classname MoReceiptDDTO
 * @description 类描述
 * @date 2021/6/25 12:35
 **/
@ApiModel(description = "入库单详情对象")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MoReceiptDDTO {
    @TableField("SequenceNumber")
    private Integer SequenceNumber;

    @ApiModelProperty(value = "主键")
    @TableId(value = "MO_RECEIPT_D_ID", type = IdType.ASSIGN_ID)
    private String moReceiptDId;

    @ApiModelProperty(value = "项次")
    @TableField("RECEIPT_REQUISTION_DOC_SEQ")
    private Integer receiptRequistionDocSeq;

    @TableField("ITEM_DESCRIPTION")
    private String itemDescription;

    @TableField("ITEM_SPECIFICATION")
    private String itemSpecification;

    @ApiModelProperty(value = "报废数量")
    @TableField("SCRAP_QTY")
    private Double scrapQty;

    @ApiModelProperty(value = "验收数量")
    @TableField("ACCEPTED_QTY")
    private Double acceptedQty;

    @ApiModelProperty(value = "破坏数量")
    @TableField("DESTROYED_QTY")
    private Double destroyedQty;

    @ApiModelProperty(value = "验收大包装数量")
    @TableField("ACCEPTED_PACKING_QTY1")
    private Double acceptedPackingQty1;

    @ApiModelProperty(value = "验收中包装数量")
    @TableField("ACCEPTED_PACKING_QTY2")
    private Double acceptedPackingQty2;

    @ApiModelProperty(value = "验收小包装数量")
    @TableField("ACCEPTED_PACKING_QTY3")
    private Double acceptedPackingQty3;

    @ApiModelProperty(value = "验收最小包装数量")
    @TableField("ACCEPTED_PACKING_QTY4")
    private Double acceptedPackingQty4;

    @ApiModelProperty(value = "验收包装数量描述")
    @TableField("ACCEPTED_PACKING_QTY")
    private String acceptedPackingQty;

    @ApiModelProperty(value = "第二单位验收数量")
    @TableField("SECOND_QTY")
    private Double secondQty;

    @ApiModelProperty(value = "验收库存数量")
    @TableField("ACCEPTED_INVENTORY_QTY")
    private Double acceptedInventoryQty;

    @ApiModelProperty(value = "已报废数量")
    @TableField("SCRAPED_QTY")
    private Double scrapedQty;

    @ApiModelProperty(value = "备注")
    @TableField("REMARK")
    private String remark;

    @ApiModelProperty(value = "有效日期")
    @TableField("EFFECTIVE_DATE")
    private String effectiveDate;

    @ApiModelProperty(value = "复检日期")
    @TableField("REINSEPCTION_DATE")
    private String reinsepctionDate;

    @ApiModelProperty(value = "生产日期")
    @TableField("PRODUCTION_DATE")
    private Date productionDate;

    @ApiModelProperty(value = "特征码")
    @TableField("ITEM_FEATURE_ID")
    private String itemFeatureId;

    @ApiModelProperty(value = "入库申请单单号")
    @TableField("MO_RECEIPT_REQUISTION_D_ID")
    private String moReceiptRequistionDId;

    @ApiModelProperty(value = "工单单号")
    @TableField("MO_ID")
    private String moId;

    @ApiModelProperty(value = "产品品号")
    @TableField("ITEM_ID")
    private String itemId;

    @ApiModelProperty(value = "业务单位")
    @TableField("BUSINESS_UNIT_ID")
    private String businessUnitId;

    @ApiModelProperty(value = "仓库")
    @TableField("WAREHOUSE_ID")
    private String warehouseId;

    @ApiModelProperty(value = "包装方式")
    @TableField("PACKING_MODE_ID")
    private String packingModeId;

    @ApiModelProperty(value = "大包装单位")
    @TableField("PACKING1_UNIT_ID")
    private String packing1UnitId;

    @ApiModelProperty(value = "中包装单位")
    @TableField("PACKING2_UNIT_ID")
    private String packing2UnitId;

    @ApiModelProperty(value = "小包装单位")
    @TableField("PACKING3_UNIT_ID")
    private String packing3UnitId;

    @ApiModelProperty(value = "最小包装单位")
    @TableField("PACKING4_UNIT_ID")
    private String packing4UnitId;

    @ApiModelProperty(value = "源工单")
    @TableField("SOURCE_MO_ID")
    private String sourceMoId;

    @ApiModelProperty(value = "库位")
    @TableField("BIN_ID")
    private String binId;

    @ApiModelProperty(value = "批号")
    @TableField("ITEM_LOT_ID")
    private String itemLotId;

    @ApiModelProperty(value = "产出类型")
    @TableField("PRODUCT_TYPE")
    private String productType;

    @ApiModelProperty(value = "工单产出ID")
    @TableField("MO_PRODUCT_ID")
    private String moProductId;

    @ApiModelProperty(value = "报废第二数量")
    @TableField("SCRAP_SECOND_QTY")
    private Double scrapSecondQty;

    @ApiModelProperty(value = "破坏第二数量")
    @TableField("DESTROYED_SECOND_QTY")
    private Double destroyedSecondQty;

    @ApiModelProperty(value = "项目")
    @TableField("PROJECT_ID")
    private String projectId;

    @ApiModelProperty(value = "WIP单号序号")
    @TableField("WIP_DOCNO")
    private String wipDocno;

    @ApiModelProperty(value = "序列号已采集数量")
    @TableField("SN_COLLECTED_QTY")
    private Double snCollectedQty;

    @ApiModelProperty(value = "序列号检核码")
    @TableField("SN_COLLECTED_STATUS")
    private String snCollectedStatus;

    @TableField("GENERATE_SOURCE")
    private String generateSource;

    @ApiModelProperty(value = "创建日期")
    @TableField(value = "CreateDate",fill = FieldFill.INSERT)
    private Date CreateDate;

    @ApiModelProperty(value = "最后修改日期")
    @TableField(value = "LastModifiedDate",fill = FieldFill.INSERT_UPDATE)
    private Date LastModifiedDate;

    @ApiModelProperty(value = "修改日期")
    @TableField(value = "ModifiedDate",fill = FieldFill.INSERT_UPDATE)
    private Date ModifiedDate;

    @ApiModelProperty(value = "创建者")
    @TableField("CreateBy")
    private String CreateBy;

    @ApiModelProperty(value = "最后修改者")
    @TableField("LastModifiedBy")
    private String LastModifiedBy;

    @ApiModelProperty(value = "修改者")
    @TableField("ModifiedBy")
    private String ModifiedBy;

    @ApiModelProperty(value = "版本号，不要随意更改")
    @TableField("Version")
    private String Version;

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

    @ApiModelProperty(value = "单据状态属性")
    @TableField("ApproveStatus")
    private String ApproveStatus;

    @ApiModelProperty(value = "修改日期")
    @TableField(value = "ApproveDate",fill = FieldFill.INSERT_UPDATE)
    private Date ApproveDate;

    @ApiModelProperty(value = "修改人")
    @TableField("ApproveBy")
    private String ApproveBy;

    @TableField("COST_DOMAIN_ID_RTK")
    private String costDomainIdRtk;

    @TableField("COST_DOMAIN_ID_ROid")
    private String costDomainIdRoid;

    @TableField("MO_RECEIPT_ID")
    private String moReceiptId;
}
