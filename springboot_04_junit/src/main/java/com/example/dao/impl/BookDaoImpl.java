package com.example.dao.impl;

import com.example.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author chenjianbing
 * @create 2021-11-08 18:08
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao is running");
    }
}
