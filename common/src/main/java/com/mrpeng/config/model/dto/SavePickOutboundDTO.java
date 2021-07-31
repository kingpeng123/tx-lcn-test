package com.mrpeng.config.model.dto;

import lombok.Data;

import java.util.List;

/**
 * 创建领料出库单对象
 * @author: pqq
 * @create: 2021-02-01 17:27
 **/
@Data
public class SavePickOutboundDTO {

    private String userId;

    private String deptId;

    private String moId;

    private List<MoDDTO> moDs;

    private String issueReceiptId;
}
