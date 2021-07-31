package com.mrpeng.config.model.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 生成物流单条件对象
 * @author: pqq
 * @create: 2021-01-13 14:05
 **/
@Data
public class SaveTransportDTO {

    private String pickOutboundId;

    private String issueReceiptId;

    private String moId;

    private String docNo;

    private Date pickDate;

    private String userId;

    private String deptId;

    private String startPosition;

    private String endPosition;

    private String warehouseId;

    private Integer type; //物流单类型

    private String moRoutingDId;

    private String nextMoRoutingDId;

    private String relatedDocument; //关联单据

    private List<TransportBodyDTO> transportBody;
}
