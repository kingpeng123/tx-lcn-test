package com.mrpeng.config.model.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;
import java.util.Map;

@ApiModel("角色列表对象")
@Data
public class RoleVO {

    private String roleType;

    private String typeName;

    private List<Map<String,String>> child;
}
