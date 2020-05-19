package com.blaineli.contrller;

import com.blaineli.entity.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：
 * @date ：Created in 2019/10/29 10:03
 * @description：
 * @modified By：
 * @version:
 */
@RestController
@RequestMapping("nacos/")
public class TestController {

    @Autowired
    private TestBean testBean;

    /**
     * 获取配置判断是否配置成功
     * @return
     */
    @RequestMapping("getConfig")
    public Object getConfig() {

        return testBean.getTest1();
    }


}
