package com.zjy.dubbolearn.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zjy.dubbolearn.api.IHelloService;

/**
 * @Author: Jason Zhang
 * @Date: 2019/5/17 5:17 PM
 * @Version: 1.0
 * @Des：
 */
@Service
public class HelloService implements IHelloService {
    @Override
    public String sayHello() {
        return "hello world from dubbo provider ";
    }
}
