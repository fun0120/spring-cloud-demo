package com.yiffq.demo.service_ribbon.controller;

import com.yiffq.demo.service_ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hzqyf on 2017/8/14 0014.
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;
    @RequestMapping("/hi")
    public String hi(){
        return helloService.hiService();
    }
}
