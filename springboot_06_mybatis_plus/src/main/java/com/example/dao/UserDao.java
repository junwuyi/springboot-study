package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author chenjianbing
 * @create 2021-11-06 21:06
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}
