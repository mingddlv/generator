package com.example.mybatis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @ClassName UserTest
 * @Description TODO
 * @Author mac
 * @DATE 2022/5/11 9:58
 */
@SpringBootTest
public class UserTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void findUser(){
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);

    }
}
