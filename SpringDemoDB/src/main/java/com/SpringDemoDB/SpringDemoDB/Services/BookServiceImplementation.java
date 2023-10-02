package com.SpringDemoDB.SpringDemoDB.Services;

import com.SpringDemoDB.SpringDemoDB.Models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SpringDemoDB.SpringDemoDB.Repositories.BookRepository;

import java.util.List;

@Service
public class BookServiceImplementation implements BookService {

    @Autowired
    private BookRepository bookrepository;

    public BookServiceImplementation (BookRepository bookRepository){
        this.bookrepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks(){
        return bookrepository.findAll();
    }

    @Override
    public List<Book> getAllBooksByAuthor(String author) {
        return bookrepository.findAllByAuthorContains(author);
    }

    @Override
    public List<Book> getAllBooksByTitle(String title) {
        return bookrepository.findAllByTitleContains(title);
    }

    @Override
    public Book saveBook(Book book){
        return bookrepository.save(book);
    }

    @Override
    public void deleteBook (Long id) {
        bookrepository.deleteById(id);
    }

    @Override
    public Book updateBook(Book book) {
       return bookrepository.save(book);
    }

}

