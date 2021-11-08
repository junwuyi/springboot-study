package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.domain.Book;

/**
 * @author chenjianbing
 * @create 2021-11-07 12:34
 */
public interface IBookService extends IService<Book> {

    // 追加的操作与原始操作通过名称区分，功能类似
    Boolean delete(Integer id);

    Boolean insert(Book book);

    Boolean modify(Book book);

    Book get(Integer id);

    IPage<Book> getPage(int currentPage, int pageSize);

    /**
     * 分页的条件查询
     *
     * @param currentPage
     * @param pageSize
     * @param book
     * @return
     */
    IPage<Book> getPage(Integer currentPage, int pageSize, Book book);
}
