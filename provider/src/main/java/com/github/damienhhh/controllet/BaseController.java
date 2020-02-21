package com.github.damienhhh.controllet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    private  ServerConfig serverConfig;

    public BaseController(ServerConfig serverConfig) {
        this.serverConfig = serverConfig;
    }

    @RequestMapping("getPort")
    public int getPort(){
        if(serverConfig.getServerPort() == 10101){
            int num = 0 / 0;
        }
        return serverConfig.getServerPort();
    }


}
