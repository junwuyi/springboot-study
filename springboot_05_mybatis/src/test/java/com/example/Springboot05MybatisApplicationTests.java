package com.example;

import com.example.dao.UserDao;
import com.example.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot05MybatisApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
        List<User> userList = userDao.getAll();
        System.out.println(userList);
    }

}
