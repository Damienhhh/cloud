package com.github.deminhhh.controller;

import com.github.deminhhh.service.BaseService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    private final BaseService baseService;

    public BaseController(BaseService baseService) {
        this.baseService = baseService;
    }

    @RequestMapping("getPort")
    @HystrixCommand(fallbackMethod ="getPortFallback")
    public int getPort(){
        return baseService.getPort();
    }


    public int getPortFallback(){
        return 500;
    }

}
