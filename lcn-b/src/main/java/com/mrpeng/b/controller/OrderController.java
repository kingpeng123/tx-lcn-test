package com.mrpeng.b.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tracing.TracingContext;
import com.mrpeng.b.feign.BankFeign;
import com.mrpeng.b.service.OrderService;
import com.mrpeng.config.entity.Order;
import com.mrpeng.config.entity.User;
import com.mrpeng.config.model.ResultObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author pqq
 * @since 2021-07-30
 */
@RestController
@RequestMapping("/b/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private BankFeign bankFeign;

    @PostMapping(value = "createOrder")
    @LcnTransaction
    @Transactional
    public ResultObj createOrder(@RequestBody User user){
        System.out.println("TracingContext.tracing().groupId() = " + TracingContext.tracing().groupId());
        Order order = orderService.getOne(new QueryWrapper<Order>().eq("user_id", user.getUserId()));

        Order or =new Order();
        or.setOrderDes("sdhfskdfds");
        or.setOrderId(12313);
        or.setUserId(1);
        boolean save = orderService.save(or);
        System.out.println("save = " + save);;
        ResultObj resultObj = bankFeign.reduceMoney(user.getUserId(), 100d);

        int i = 10/0;
        return resultObj;
    }

    @GetMapping(value = "hello")
    public R<String> hello (){
        return R.ok("hello");
    }


}

