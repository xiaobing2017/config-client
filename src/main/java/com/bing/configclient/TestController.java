package com.bing.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

    @Value("${a}")
    private String code;

    @RequestMapping("/from")
    public String from(){
        return "hello  :  "+code;
    }
}
