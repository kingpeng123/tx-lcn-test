package com.mrpeng.a.controller;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tracing.TracingContext;
import com.mrpeng.a.feign.OrderFeign;
import com.mrpeng.a.service.UserService;
import com.mrpeng.config.entity.Order;
import com.mrpeng.config.entity.User;
import com.mrpeng.config.model.ResultObj;
import org.apache.catalina.AccessLog;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author pqq
 * @since 2021-07-30
 */
@RestController
@RequestMapping("/a/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private OrderFeign orderFeign;

    @GetMapping(value = "placeOrder/{userId}")
    @LcnTransaction
    @Transactional
    public ResultObj placeOrder(@PathVariable String userId){
        ResultObj order = null;
        try {
            System.out.println("TracingContext.tracing().groupId() = " + TracingContext.tracing().groupId());
            UpdateWrapper<User> userUpdateWrapper =new UpdateWrapper<>();
            User usr =new User();
            usr.setUserId(Integer.valueOf(userId));
            int i = RandomUtils.nextInt(1, 100);
            usr.setSex(String.valueOf(i));
            boolean updateById = userService.updateById(usr);
            System.out.println("updateById = " + updateById);
            User user = userService.getById(userId);
            System.out.println(user);
//            R<String> r = orderFeign.hello();
            order = orderFeign.createOrder(user);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return order;
    }


}

