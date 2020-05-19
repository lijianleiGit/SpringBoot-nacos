package com.blaineli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author ：
 * @date ：Created in 2019/10/29 9:18
 * @description：
 * @modified By：
 * @version:
 */
@SpringBootApplication
@RefreshScope
@EnableDiscoveryClient
public class NacosDemo_1 {
    public static void main(String[] args) {
        SpringApplication.run(NacosDemo_1.class,args);
    }

}
