package com.mrpeng.config.model.dto;


import com.mrpeng.config.model.vo.UserApply;
import lombok.Data;

import java.util.Collection;

/**
 * @author pengquan
 * @version 1.0
 * @classname UserApplyDTO
 * @description spring mvc 接收集合类型对象
 * @date 2021/6/3 13:52
 **/
@Data
public class UserApplyDTO {
    private Collection<UserApply> userApplies;
}
