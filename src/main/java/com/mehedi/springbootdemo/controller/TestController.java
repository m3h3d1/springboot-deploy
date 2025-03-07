package com.mehedi.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping
    public Object hello() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Mehedi Hasan Parvez");
        map.put("email", "mehedi@gmail.com");
        return map;
    }
}
