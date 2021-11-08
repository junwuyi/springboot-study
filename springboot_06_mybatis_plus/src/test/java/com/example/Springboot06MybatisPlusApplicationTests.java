package com.example;

import com.example.dao.UserDao;
import com.example.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot06MybatisPlusApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
        List<User> users = userDao.selectList(null);
        System.out.println(users);
    }

}
