package sda.tasks.task10.controller;

import org.springframework.web.bind.annotation.*;
import sda.tasks.task10.Book;
import sda.tasks.task10.service.BookService;

import java.util.List;

// Klasa kontrolera
@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    // Wstrzyknięcie zależności do serwisu
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // Metoda do pobierania wszystkich książek
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // Metoda do pobierania książki po id
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    // Metoda do dodawania nowej książki
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    // Metoda do aktualizowania istniejącej książki
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }

    // Metoda do usuwania książki po id
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}
