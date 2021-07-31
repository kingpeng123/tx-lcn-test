package com.mrpeng.a;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: pqq
 * @create: 2021-03-15 17:09
 **/
@SpringBootApplication
@ComponentScan("com.mrpeng")
@MapperScan("com.mrpeng.a.mapper")
@EnableFeignClients
@EnableDistributedTransaction
public class ClientAApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientAApplication.class,args);
    }
}
