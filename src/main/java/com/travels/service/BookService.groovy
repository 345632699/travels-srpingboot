package com.travels.service

import com.travels.entity.Book
import com.travels.dao.IBookDao
import org.springframework.stereotype.Service

import javax.annotation.Resource
@Service
class BookService {
    @Resource
    IBookDao bookDao;

    List<Book> getBooks() {
        bookDao.getBooks()
    }

    Book getBook(int id){
        bookDao.getBook(id)
    }
}