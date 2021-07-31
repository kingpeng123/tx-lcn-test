package com.mrpeng.a.service.impl;

import com.mrpeng.a.mapper.UserMapper;
import com.mrpeng.a.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mrpeng.config.entity.User;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
