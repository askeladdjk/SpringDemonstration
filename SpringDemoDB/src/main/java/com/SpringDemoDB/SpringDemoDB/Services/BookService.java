package com.SpringDemoDB.SpringDemoDB.Services;

        import com.SpringDemoDB.SpringDemoDB.Models.Book;

        import java.util.List;

public interface BookService{

    List<Book> getAllBooks();
    List<Book> getAllBooksByAuthor(String author);
    List<Book> getAllBooksByTitle(String title);
    Book saveBook(Book book);
    void deleteBook(Long id);
    Book updateBook(Book book);

    BookService BOOKSERVICE();

}

