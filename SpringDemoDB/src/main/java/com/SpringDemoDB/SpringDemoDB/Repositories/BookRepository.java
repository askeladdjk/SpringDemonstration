package com.SpringDemoDB.SpringDemoDB.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SpringDemoDB.SpringDemoDB.Models.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAllByAuthorContains(String author);
    List<Book> findAllByTitleContains(String title);

}

