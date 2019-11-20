package com.zmq.controller;

import com.zmq.service.ProvideService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Reference
    ProvideService provideService;

    @RequestMapping("sayHello")
    public String sayHello(){
        return provideService.sayHello("我爱你");
    }
}
