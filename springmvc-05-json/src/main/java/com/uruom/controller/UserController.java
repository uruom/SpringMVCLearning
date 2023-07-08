package com.uruom.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.uruom.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//(RestController只返回字符串，不走解析器)
@RestController
public class UserController {

    @RequestMapping(value = "/j1",produces = "application/json;charset=utf-8")
    public String json1() throws JsonProcessingException {
//        System.out.println("AAAAAA");
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("幽若梦", 3, "男");

        String str = mapper.writeValueAsString(user);

        return str;
    }

    @RequestMapping("/ttt")
    public String test1(Model model){
           model.addAttribute("msg","test1");
           return "test";
    }


    @RequestMapping(value = "/j2",produces = "application/json;charset=utf-8")
    public String json2() throws JsonProcessingException {
//        System.out.println("AAAAAA");
        ObjectMapper mapper = new ObjectMapper();
        List<User> userList = new ArrayList<User>();

        User user1 = new User("幽若梦1", 3, "男");
        User user2 = new User("幽若梦2", 3, "男");
        User user3 = new User("幽若梦3", 3, "男");
        User user4 = new User("幽若梦4", 3, "男");
        User user5 = new User("幽若梦5", 3, "男");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        String str = mapper.writeValueAsString(userList);

        return str;
    }

    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Date date = new Date();
//        使用ObjectMapper 来格式化输出
//        不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);


//        ObjectMapper,时间解析后的默认格式为 TImeStamp 1970年到现在的毫秒数


//        自定义日期的格式
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        mapper.setDateFormat(sdf);


        return mapper.writeValueAsString(date);
    }

    @RequestMapping(value = "/j4",produces = "application/json;charset=utf-8")
    public String json4() throws JsonProcessingException {

        List<User> userList = new ArrayList<User>();

        User user1 = new User("幽若梦1", 3, "男");
        User user2 = new User("幽若梦2", 3, "男");
        User user3 = new User("幽若梦3", 3, "男");
        User user4 = new User("幽若梦4", 3, "男");
        User user5 = new User("幽若梦5", 3, "男");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        return  "ENN";

//        JSON.toJSONString(userList);
    }

}
