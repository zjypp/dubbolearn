package com.zjy.dubbolearn.dubboconsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zjy.dubbolearn.api.IHelloService;
import org.springframework.stereotype.Component;

/**
 * @Author: Jason Zhang
 * @Date: 2019/5/17 5:24 PM
 * @Version: 1.0
 * @Des：
 */
@Component
public class HelloConsumerService implements IHelloService {

    @Reference
    IHelloService helloService;

    @Override
    public String sayHello() {
        return helloService.sayHello();
    }
}
