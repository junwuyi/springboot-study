package com.example.controller;

import com.example.MyDataSource;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenjianbing
 * @create 2021-11-08 10:59
 */
//Rest 模式
@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${country}")
    private String country1;

    @Value("${user.age}")
    private String age1;

    @Value("${likes[1]}")
    private String likes1;

    @Value("${users[1].name}")
    private String name1;

    @Value("${tempDir2}")
    private String tempDir1;

    //使用自动装配将所有的数据封装到一个对象Environment中
    @Autowired
    private Environment env;

    @Autowired
    private MyDataSource myDataSource;

    @GetMapping
    public String getById() {
        System.out.println("springboot is running2...");
        System.out.println("country1=>" + country1);
        System.out.println("age1=>" + age1);
        System.out.println("likes1=>" + likes1);
        System.out.println("name1=>" + name1);
        System.out.println("tempDir1=>" + tempDir1);

        System.out.println("-----------------------------");
        System.out.println(env.getProperty("server.port"));
        System.out.println(env.getProperty("user.name"));

        System.out.println("-----------------------------");
        System.out.println(myDataSource);

        return "springboot is running2...";
    }
}
