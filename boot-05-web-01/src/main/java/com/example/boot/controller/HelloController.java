package com.example.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenjianbing
 * @create 2021-09-20 18:09
 */
@RestController
public class HelloController {

    @RequestMapping("bug.jpg")
    public String hello(){
        return "aaaaaa";
    }
}
