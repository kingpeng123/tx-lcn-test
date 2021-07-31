package com.mrpeng.config.model.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 生成领料单条件对象
 * @author: pqq
 * @create: 2021-03-25 13:17
 **/
public class SaveIssueReceiptDTO {
    @NotBlank(message = "用户ID不能为空")
    private String userId;

    @NotBlank(message = "用户部门不能为空")
    private String deptId;

    @NotBlank(message = "工单主键不能为空")
    private String moId;

    @NotEmpty(message = "工单物料列表不能为空")
    private List<MoDDTO> ddtos;

    @NotBlank(message = "单据类型ID不能为空")
    private String docId;

    @NotBlank(message = "领料单号不能为空")
    private String issueReceiptDoc;

    @NotBlank(message = "工作中心ID不能为空")
    private String workCenter;

    @NotBlank(message = "工作中心RTK不能为空")
    private String workCenterRtk;

    private String issueReceiptStatus;


    public SaveIssueReceiptDTO(String userId, String deptId,String moId, List<MoDDTO> ddtos,String issueReceiptDoc) {
        this.userId = userId;
        this.deptId = deptId;
        this.moId = moId;
        this.ddtos = ddtos;
        this.issueReceiptDoc = issueReceiptDoc;
    }

    public SaveIssueReceiptDTO() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getMoId() {
        return moId;
    }

    public void setMoId(String moId) {
        this.moId = moId;
    }

    public List<MoDDTO> getDdtos() {
        return ddtos;
    }

    public void setDdtos(List<MoDDTO> ddtos) {
        this.ddtos = ddtos;
    }

    public String getIssueReceiptDoc() {
        return issueReceiptDoc;
    }

    public void setIssueReceiptDoc(String issueReceiptDoc) {
        this.issueReceiptDoc = issueReceiptDoc;
    }
    public String getWorkCenter() {
        return workCenter;
    }

    public void setWorkCenter(String workCenter) {
        this.workCenter = workCenter;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getIssueReceiptStatus() {
        return issueReceiptStatus;
    }

    public void setIssueReceiptStatus(String issueReceiptStatus) {
        this.issueReceiptStatus = issueReceiptStatus;
    }

    public String getWorkCenterRtk() {
        return workCenterRtk;
    }

    public void setWorkCenterRtk(String workCenterRtk) {
        this.workCenterRtk = workCenterRtk;
    }
}
