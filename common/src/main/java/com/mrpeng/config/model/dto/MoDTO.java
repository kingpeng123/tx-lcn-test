package com.mrpeng.config.model.dto;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 工单/CHT/工單/ENU/MO
 * </p>
 *
 * @author pqq
 * @since 2020-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("MO")
@ApiModel(value="Mo对象", description="工单/CHT/工單/ENU/MO")
public class MoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "关联部门")
    @TableField("Owner_Dept")
    private String ownerDept;

    @ApiModelProperty(value = "关联员工")
    @TableField("Owner_Emp")
    private String ownerEmp;

    @ApiModelProperty(value = "单号")
    @TableField("DOC_NO")
    private String docNo;

    @ApiModelProperty(value = "单据日期")
    @TableField("DOC_DATE")
    private String docDate;

    @ApiModelProperty(value = "单据类型")
    @TableField("DOC_ID")
    private String docId;

    @ApiModelProperty(value = "主键")
    @TableId(value = "MO_ID", type = IdType.ASSIGN_ID)
    private String moId;

    @ApiModelProperty(value = "产品品名")
    @TableField("ITEM_DESCRIPTION")
    private String itemDescription;

    @ApiModelProperty(value = "产品规格")
    @TableField("ITEM_SPECIFICATION")
    private String itemSpecification;

    @ApiModelProperty(value = "BOM版次")
    @TableField("BOM_VERSION_TIMES")
    private String bomVersionTimes;

    @ApiModelProperty(value = "BOM日期")
    @TableField("BOM_DATE")
    private String bomDate;

    @ApiModelProperty(value = "紧急")
    @TableField("URGENT")
    private Boolean urgent;

    @ApiModelProperty(value = "状态码（1未配料，2已配料，3已派工，4已发料，5生产中，Y完工，y指定完工）")
    @TableField("STATUS")
    private String status;

    @ApiModelProperty(value = "批工单")
    @TableField("LOT_MO_FLAG")
    private Boolean lotMoFlag;

    @ApiModelProperty(value = "预计产量")
    @TableField("PLAN_QTY")
    private Double planQty;

    @ApiModelProperty(value = "申请数量")
    @TableField("REQ_QTY")
    private Double reqQty;

    @ApiModelProperty(value = "已生产量")
    @TableField("COMPLETED_QTY")
    private Double completedQty;

    @ApiModelProperty(value = "报废数量")
    @TableField("SCRAP_QTY")
    private Double scrapQty;

    @ApiModelProperty(value = "破坏数量")
    @TableField("DESTROYED_QTY")
    private Double destroyedQty;

    @ApiModelProperty(value = "预计开工日期")
    @TableField("PLAN_START_DATE")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date planStartDate;

    @ApiModelProperty(value = "预计完工日期")
    @TableField("PLAN_COMPLETE_DATE")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date planCompleteDate;

    @ApiModelProperty(value = "实际开工日期")
    @TableField("ACTUAL_START_DATE")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date actualStartDate;

    @ApiModelProperty(value = "实际完工日期")
    @TableField("ACTUAL_COMPLETE_DATE")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date actualCompleteDate;

    @ApiModelProperty(value = "计划批号")
    @TableField("PLAN_LOT")
    private String planLot;

    @ApiModelProperty(value = "备注")
    @TableField("REMARK")
    private String remark;

    @ApiModelProperty(value = "工艺管理")
    @TableField("ROUTING_CONTROL")
    private Boolean routingControl;

    @ApiModelProperty(value = "批工单数量")
    @TableField("LOT_MO_QTY")
    private Double lotMoQty;

    @ApiModelProperty(value = "入库申请")
    @TableField("RECEIPT_REQ_CONTROL")
    private Boolean receiptReqControl;

    @ApiModelProperty(value = "已采数量")
    @TableField("SUPPLY_PURCHASED_QTY")
    private Double supplyPurchasedQty;

    @ApiModelProperty(value = "分配数量")
    @TableField("SUPPLY_APPLY_QTY")
    private Double supplyApplyQty;

    @ApiModelProperty(value = "分配状态")
    @TableField("SUPPLY_DISPATCH_STATUS")
    private String supplyDispatchStatus;

    @ApiModelProperty(value = "产品品号")
    @TableField("ITEM_ID")
    private String itemId;

    @ApiModelProperty(value = "业务单位")
    @TableField("BUSINESS_UNIT_ID")
    private String businessUnitId;

    @ApiModelProperty(value = "特征码")
    @TableField("ITEM_FEATURE_ID")
    private String itemFeatureId;

    @ApiModelProperty(value = "工艺路线号")
    @TableField("ITEM_ROUTING_ID")
    private String itemRoutingId;

    @ApiModelProperty(value = "源工单单号")
    @TableField("SOURCE_MO_ID")
    private String sourceMoId;

    @ApiModelProperty(value = "母工单单号")
    @TableField("PARA_MO_ID")
    private String paraMoId;

    @ApiModelProperty(value = "部门")
    @TableField("ADMIN_UNIT_ID")
    private String adminUnitId;

    @ApiModelProperty(value = "上阶工单单号")
    @TableField("UP_MO_ID")
    private String upMoId;

    @ApiModelProperty(value = "生产批号")
    @TableField("ITEM_LOT_ID")
    private String itemLotId;

    @ApiModelProperty(value = "主键")
    @TableField("ASSIGN_FINISH_PERSON")
    private String assignFinishPerson;

    @ApiModelProperty(value = "最早开工时间")
    @TableField("ACTUAL_START_DATETIME")
    private String actualStartDatetime;

    @ApiModelProperty(value = "预计产量第二数量")
    @TableField("PLAN_SECOND_QTY")
    private Double planSecondQty;

    @ApiModelProperty(value = "批工单第二数量")
    @TableField("LOT_MO_SECOND_QTY")
    private Double lotMoSecondQty;

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

    @ApiModelProperty(value = "需求单号")
    @TableField("DEMAND_NO")
    private String demandNo;

    @ApiModelProperty(value = "工单图片")
    @TableField("MO_PIC")
    private String moPic;

    @ApiModelProperty(value = "工艺管理")
    @TableField("ITEM_ROUTING_CONTROL")
    private String itemRoutingControl;

    @ApiModelProperty(value = "审核日期")
    @TableField("TRANSACTION_DATE")
    private String transactionDate;

    @ApiModelProperty(value = "入库仓库")
    @TableField("WAREHOUSE_ID")
    private String warehouseId;

    @ApiModelProperty(value = "项目")
    @TableField("PROJECT_ID")
    private String projectId;

    @ApiModelProperty(value = "RMA号")
    @TableField("RMA")
    private String rma;

    @ApiModelProperty(value = "协同关系")
    @TableField("SYNERGY_ID")
    private String synergyId;

    @ApiModelProperty(value = "不计算成本")
    @TableField("NOT_COST")
    private Boolean notCost;

    @TableField("ISSUE_BY_OP_SEQ")
    private Boolean issueByOpSeq;

    @TableField("MO_CAN_PRODUCT")
    private Boolean moCanProduct;

    @ApiModelProperty(value = "打印次数")
    @TableField("PrintCount")
    private Integer PrintCount;

    @ApiModelProperty(value = "EF签核码")
    @TableField("EFNETStatus")
    private String EFNETStatus;

    @ApiModelProperty(value = "签核业务动作")
    @TableField("EFNETAction")
    private String EFNETAction;

    @ApiModelProperty(value = "EFNET单别")
    @TableField("EFNETDOCCategory")
    private String EFNETDOCCategory;

    @ApiModelProperty(value = "EFNET单号")
    @TableField("EFNETDOCNumber")
    private String EFNETDOCNumber;

    @ApiModelProperty(value = "版本号，不要随意更改")
    @TableField("Version")
    private String Version;

    @ApiModelProperty(value = "创建日期")
    @TableField(value = "CreateDate",fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GTM+8")
    private Date CreateDate;

    @ApiModelProperty(value = "最后修改日期")
    @TableField(value = "LastModifiedDate",fill = FieldFill.INSERT_UPDATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GTM+8")

    private Date LastModifiedDate;

    @ApiModelProperty(value = "修改日期")
    @TableField(value = "ModifiedDate",fill = FieldFill.INSERT_UPDATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GTM+8")
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

    @ApiModelProperty(value = "附件")
    @TableField("Attachments")
    private String Attachments;

    @ApiModelProperty(value = "表单所在的流程实例的编号")
    @TableField("ProcessInstanceId")
    private String ProcessInstanceId;

    @ApiModelProperty(value = "单据状态属性")
    @TableField("ApproveStatus")
    private String ApproveStatus;

    @ApiModelProperty(value = "修改日期")
    @TableField(value = "ApproveDate",fill = FieldFill.INSERT_UPDATE)
    private Date ApproveDate;

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

    @TableField("Owner_Org_RTK")
    private String ownerOrgRtk;

    @TableField("Owner_Org_ROid")
    private String ownerOrgRoid;

    @TableField("SOURCE_ID_RTK")
    private String sourceIdRtk;

    @TableField("SOURCE_ID_ROid")
    private String sourceIdRoid;

    @TableField("SOURCE_FROM_RTK")
    private String sourceFromRtk;

    @TableField("SOURCE_FROM_ROid")
    private String sourceFromRoid;


}
