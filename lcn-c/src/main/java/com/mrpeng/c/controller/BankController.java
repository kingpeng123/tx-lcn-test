package com.mrpeng.c.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tracing.TracingContext;
import com.mrpeng.c.service.BankService;
import com.mrpeng.config.entity.Bank;

import com.mrpeng.config.model.ResultObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author pqq
 * @since 2021-07-30
 */
@RestController
@RequestMapping("/c/bank")
public class BankController {

    @Autowired
    private BankService bankService;
    @GetMapping(value = "reduceMoney/{userId}/{money}")
    @LcnTransaction
    @Transactional
    public ResultObj reduceMoney(@PathVariable(value = "userId") Integer userId, @PathVariable(value = "money") Double money){
        System.out.println(TracingContext.tracing().groupId());
        UpdateWrapper<Bank> bankUpdateWrapper =new UpdateWrapper<>();
        bankUpdateWrapper.setSql("balance = balance -"+money.toString()).eq("user_id",userId);
        boolean update = bankService.update(bankUpdateWrapper);
        System.out.println(update);
        Bank bank = bankService.getOne(new QueryWrapper<Bank>().eq("user_id", userId));
        return ResultObj.ok().data(bank);
    }

}

