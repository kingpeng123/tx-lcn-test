package com.mrpeng;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author: pqq
 * @create: 2021-03-15 17:08
 **/
@SpringBootApplication
@EnableScheduling
@EnableTransactionManagerServer //开启lcn分布式事务
public class TMApplication {

    public static void main(String[] args) {
        SpringApplication.run(TMApplication.class,args);
        System.out.println("TM事务管理界面：http://127.0.0.1:7970/admin/index.html#/login");
    }
}