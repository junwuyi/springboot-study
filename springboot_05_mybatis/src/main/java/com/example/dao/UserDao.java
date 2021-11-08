package com.example.dao;

import com.example.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author chenjianbing
 * @create 2021-11-06 21:06
 */
@Mapper
public interface UserDao {

    @Select("select * from user")
    public List<User> getAll();
}
