package com.github.damienhhh.controllet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BaseController {

    private final RestTemplate restTemplate;

    public BaseController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("getPort")
    public int getPort(){
        return restTemplate.getForObject("http://provider/getPort",Integer.class);
    }
}
