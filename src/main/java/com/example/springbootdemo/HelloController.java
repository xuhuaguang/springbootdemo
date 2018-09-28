package com.example.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author 601278
 * Date 2018/9/28、15:19
 * Version 1.0
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("hello")
    public String hello() {
        return "Hello this is my first springboot demo";
    }

    @RequestMapping("/list")
    public List<Map<String, String>> getList() {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = null;
        for (int i = 1; i <= 5; i++) {
            map = new HashMap<>(5);
            map.put("string", "hello" + i);
            list.add(map);
        }
        return list;
    }

}
