package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 领料单详细信息
 * @author: pqq
 * @create: 2021-01-08 13:08
 **/

@Data
@ApiModel(value = "领料单详细信息对象")
public class IssueReceiptDetailVO {

    @ApiModelProperty(value = "领料单单头")
    IssueReceiptHeadVO issueReceiptHead;

    @ApiModelProperty(value = "领料单单身")
    List<IssueReceiptBodyVO> issueReceiptBody;
}
