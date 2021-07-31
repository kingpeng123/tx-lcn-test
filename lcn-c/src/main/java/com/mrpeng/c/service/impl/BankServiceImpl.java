package com.mrpeng.c.service.impl;

import com.mrpeng.c.mapper.BankMapper;
import com.mrpeng.c.service.BankService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mrpeng.config.entity.Bank;
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
public class BankServiceImpl extends ServiceImpl<BankMapper, Bank> implements BankService {

}
