package com.yiffq.demo.service_ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by hzqyf on 2017/8/14 0014.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(){

        return restTemplate.getForObject("http://SERVICE-HI/hi",String.class);
    }
}
