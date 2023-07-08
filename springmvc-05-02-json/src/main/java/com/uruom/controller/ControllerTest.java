package com.uruom.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerTest {

    @GetMapping("/t1")
    public String test(Model model){
        model.addAttribute("msg","Test");
        return "test";
    }
}
