package com.atguigu.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: HelloController
 * @Author LiuXianKun
 * @Date: 2020/9/21 00:02
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "宝塔镇河妖1111";
    }
    @GetMapping("/hello1")
    public String hello1() {
        return "宝塔镇河妖1";
    }
    @GetMapping("/hello2")
    public String hello2() {
        return "宝塔镇河妖12";
    }

}
