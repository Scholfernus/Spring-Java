package sda.tasks.task10.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.tasks.task10.Book;
import sda.tasks.task10.BookRepository;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public List<Book> findByTitle(String title){
    return bookRepository.findByTitle(title);
    }
    public Book findByISBN(String ISBN){
    return bookRepository.findByISBN(ISBN);
    }
    public Book findByAuthorAndISBN(String author, String ISBN){
    return bookRepository.findByAuthorAndISBN(author,ISBN);
    }
    public List<Book> findByTitleStartingWith(String prefix) {
        return bookRepository.findByTitleStartingWith(prefix);
    }

    public List<Book> findByPagesNumBetween(int minPages, int maxPages) {
        return bookRepository.findByPagesNumBetween(minPages, maxPages);
    }
}
