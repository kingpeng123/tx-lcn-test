package com.mrpeng.b.service.impl;


import com.mrpeng.b.mapper.OrderMapper;
import com.mrpeng.b.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mrpeng.config.entity.Order;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author pqq
 * @since 2021-07-30
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
