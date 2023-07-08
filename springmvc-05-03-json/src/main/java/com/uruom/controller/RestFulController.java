package com.uruom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFulController {


//    原来的http://localhost:8080/add?a=1&b=2
    @RequestMapping("/add")
    public String test2(int a, int b, Model model){


        int res = a+b;
        model.addAttribute("msg","结果为"+res);

        return "test";
    }

    //    原来的http://localhost:8080/add/1/2
//    @RequestMapping("/add/{a}/{b}")
//    @GetMapping("/add/{a}/{b}")
    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    public String test1(@PathVariable int a,@PathVariable int b, Model model){
        int res = a+b;
        model.addAttribute("msg","delete结果为"+res);

        return "test";
    }
//    @GetMapping("/add/{a}/{b}")
//    public String test3(@PathVariable int a,@PathVariable int b, Model model){
//        int res = a+b;
//        model.addAttribute("msg","get结果为"+res);
//
//        return "test";
//    }

    @PostMapping("/add/{a}/{b}")
    public String test4(@PathVariable int a,@PathVariable int b, Model model){
        int res = a+b;
        model.addAttribute("msg","postt结果为"+res);

        return "test";
    }


}
