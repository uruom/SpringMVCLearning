package com.uruom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EncodingController {
    @RequestMapping
    public String test1(){
        return "test";
    }
}
