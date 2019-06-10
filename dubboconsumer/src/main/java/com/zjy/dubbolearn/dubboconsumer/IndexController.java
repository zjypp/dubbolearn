package com.zjy.dubbolearn.dubboconsumer;

import com.zjy.dubbolearn.api.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Jason Zhang
 * @Date: 2019/5/17 5:28 PM
 * @Version: 1.0
 * @Des：
 */
@RestController
public class IndexController {

    @Autowired
    IHelloService helloService;

    @GetMapping("/index")
    public String index(){
        return helloService.sayHello();
    }
}
