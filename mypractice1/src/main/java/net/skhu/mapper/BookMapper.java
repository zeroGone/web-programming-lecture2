package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.skhu.dto.Book;

@Mapper
public interface BookMapper {
    Book findOne(int id);
    List<Book> findAll();
    List<Book> findByTitle(String input);
    List<Book> findByCategory(int categoryId);
    void insert(Book book);
    void update(Book book);
    void delete(int id);
}


