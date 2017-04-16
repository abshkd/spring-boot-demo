package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by abhis_000 on 4/16/2017.
 */
@Service
public class Message {

    @Value("${myapp.msg}")
    private String msg;

    public String getMsg() {
        return msg;
    }
}
