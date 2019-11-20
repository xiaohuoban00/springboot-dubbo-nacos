package com.zmq.service.impl;

import com.zmq.service.ProvideService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class ProvideImpl implements ProvideService {
    public String sayHello(String word) {
        return word;
    }
}
