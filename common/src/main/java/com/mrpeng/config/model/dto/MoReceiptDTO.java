package com.mrpeng.config.model.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 *  入库单服务调用对象
 * @author: pqq
 * @create: 2021-02-19 11:22
 **/
@Data
public class MoReceiptDTO {
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date docDate;

    @ApiModelProperty(value = "单据类型")
    @TableField("DOC_ID")
    private String docId;

    @ApiModelProperty(value = "主键")
    @TableId(value = "MO_RECEIPT_ID", type = IdType.ASSIGN_ID)
    private String moReceiptId;

    @ApiModelProperty(value = "交易日期")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @TableField("TRANSACTION_DATE")
    private Date transactionDate;

    @ApiModelProperty(value = "自动扣料更新码")
    @TableField("BACKFLUSH_UPDATE")
    private Boolean backflushUpdate;

    @ApiModelProperty(value = "生成分录-成本")
    @TableField("JOURNALIZED_COST")
    private Boolean journalizedCost;

    @ApiModelProperty(value = "备注")
    @TableField("REMARK")
    private String remark;

    @ApiModelProperty(value = "部门")
    @TableField("ADMIN_UNIT_ID")
    private String adminUnitId;

    @ApiModelProperty(value = "工作中心")
    @TableField("WORK_CENTER_ID")
    private String workCenterId;

    @ApiModelProperty(value = "会计年度")
    @TableField("ACCOUNT_YEAR")
    private Integer accountYear;

    @ApiModelProperty(value = "会计期间序号")
    @TableField("ACCOUNT_PERIOD_SEQNO")
    private Integer accountPeriodSeqno;

    @ApiModelProperty(value = "已生成运营账簿分录")
    @TableField("GLOB_JE_INDICATOR")
    private Boolean globJeIndicator;

    @ApiModelProperty(value = "已生成管理账簿分录")
    @TableField("GLMB_JE_INDICATOR")
    private Boolean glmbJeIndicator;

    @ApiModelProperty(value = "管理账簿分录")
    @TableField("GLMB_JE_ID")
    private String glmbJeId;

    @ApiModelProperty(value = "运营账簿分录")
    @TableField("GLOB_JE_ID")
    private String globJeId;

    @ApiModelProperty(value = "WIP传入ID")
    @TableField("WIP_NO")
    private String wipNo;

    @ApiModelProperty(value = "限用仓库")
    @TableField("WAREHOUSE_ID")
    private String warehouseId;

    @TableField("GENERATE_SOURCE")
    private String generateSource;

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

    @ApiModelProperty(value = "创建日期")
    @TableField("CreateDate")
    private Date CreateDate;

    @ApiModelProperty(value = "最后修改日期")
    @TableField("LastModifiedDate")
    private Date LastModifiedDate;

    @ApiModelProperty(value = "修改日期")
    @TableField("ModifiedDate")
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

    @ApiModelProperty(value = "工单入库类型（1,留在工位，2运抵仓库，3,入库完成）")
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
    @TableField("ApproveDate")
    private Date ApproveDate;

    @ApiModelProperty(value = "修改人")
    @TableField("ApproveBy")
    private String ApproveBy;

    @TableField("Owner_Org_RTK")
    private String ownerOrgRtk;

    @TableField("Owner_Org_ROid")
    private String ownerOrgRoid;

    @TableField("SOURCE_DOC_ID_RTK")
    private String sourceDocIdRtk;

    @TableField("SOURCE_DOC_ID_ROid")
    private String sourceDocIdRoid;

    @TableField("SOURCE_ID_RTK")
    private String sourceIdRtk;

    @TableField("SOURCE_ID_ROid")
    private String sourceIdRoid;

}
