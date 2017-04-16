package com.example.controller;

import com.example.service.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abhis_000 on 4/16/2017.
 */
@RestController
class Home {

    @Autowired
    Message msg;


    @Value("${myapp.name}")
    private String name;

    @RequestMapping("/")
    public String getName() {
        return name;
    }

    @RequestMapping("/service")
    public String message(){
        return msg.getMsg();
    }


}
