package com.travels.dao

import com.travels.entity.Book
import org.springframework.stereotype.Repository

@Repository
interface IBookDao {
    List<Book> getBooks()
    Book getBook(int id)
}