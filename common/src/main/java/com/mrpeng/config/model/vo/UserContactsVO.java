package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author pengquan
 * @version 1.0
 * @classname UserContactsVO
 * @description 类描述
 * @date 2021/7/21 15:39
 **/
@Data
@ApiModel(description = "用户联系人视图对象",value = "UserContactsVO")
public class UserContactsVO {

    @ApiModelProperty(value = "描点集合")
    public String [] anchors;

    @ApiModelProperty(value = "员工信息")
    public Map<String, List<UserInfo>> list;

}
