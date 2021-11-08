package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.domain.Book;

import java.util.List;

/**
 * 业务层接口
 *
 * @author chenjianbing
 * @create 2021-11-07 12:00
 */
public interface BookService {

    Boolean save(Book book);

    Boolean update(Book book);

    Boolean delete(Integer id);

    Book getById(Integer id);

    List<Book> getAll();

    IPage<Book> getPage(int currentPage,int pageSize);
}
