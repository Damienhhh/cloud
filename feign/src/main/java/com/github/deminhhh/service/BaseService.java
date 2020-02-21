package com.github.deminhhh.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("provider")
public interface BaseService {

    @RequestMapping("getPort")
    int getPort();

}
