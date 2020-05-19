package com.blaineli.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author ：
 * @date ：Created in 2019/10/29 9:58
 * @description：
 * @modified By：
 * @version:
 */
@ConfigurationProperties("comtest")
@RefreshScope
@Data
@Component
public class TestBean {
    private Integer test1;
}
