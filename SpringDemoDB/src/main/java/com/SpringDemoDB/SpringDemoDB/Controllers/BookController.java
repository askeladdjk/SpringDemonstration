package com.SpringDemoDB.SpringDemoDB.Controllers;

import com.SpringDemoDB.SpringDemoDB.Models.Book;
import com.SpringDemoDB.SpringDemoDB.Repositories.BookRepository;
import com.SpringDemoDB.SpringDemoDB.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {

        return bookService.getAllBooks();
    }

    @PostMapping("/add")
    public Book saveBook(@RequestBody Book book) {

        return bookService.saveBook(book);
    }

    @DeleteMapping("/delete/{id}")
    public List<Book> deleteBook(@PathVariable Long id) {

          bookService.deleteBook(id);
          return bookService.getAllBooks();
    }

    @PostMapping("/update/{id}")
    public Book updateBook(@PathVariable Long id) {

        Book exbook = bookRepository.findById(id).get();

        return bookService.updateBook(exbook);
    }

    @GetMapping("/searchbyauthor")
    public List<Book> getAuthor (@RequestParam String author){
        return bookService.getAllBooksByAuthor(author);
    }

    @GetMapping("/searchbytitle")
    public List<Book> getTitle (@RequestParam String title){
        return bookService.getAllBooksByTitle(title);
    }
}
