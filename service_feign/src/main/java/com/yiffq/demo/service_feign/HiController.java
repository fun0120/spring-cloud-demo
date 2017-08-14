package com.yiffq.demo.service_feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hzqyf on 2017/8/14 0014.
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi" ,method = RequestMethod.GET)
    public String sayHi(){
        return schedualServiceHi.sayHiFromClientOne();
    }
}
