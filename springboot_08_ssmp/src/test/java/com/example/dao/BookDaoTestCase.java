package com.example.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.domain.Book;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author chenjianbing
 * @create 2021-11-07 10:19
 */
@SpringBootTest
public class BookDaoTestCase {

    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById() {
        System.out.println(bookDao.getById(1));
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.insert(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(13);
        book.setType("测试数据asfd");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.updateById(book);
    }

    @Test
    void testDelete() {
        bookDao.deleteById(13);
    }

    @Test
    void testGetAll() {
        System.out.println(bookDao.selectList(null));
    }

    @Test
    void testGetPage() {
        IPage page = new Page(1, 5);
        bookDao.selectPage(page, null);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.getRecords());
    }

    @Test
    void testGetBy() {
        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", "Spring");
        bookDao.selectList(queryWrapper);
    }

    @Test
    void testGetBy2() {
        String name = "1";
        LambdaQueryWrapper<Book> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        //if (name != null) lambdaQueryWrapper.like(Book::getName,name);
        lambdaQueryWrapper.like(Strings.isNotEmpty(name), Book::getName, name);
        bookDao.selectList(lambdaQueryWrapper);
    }
}
