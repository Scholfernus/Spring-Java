package sda.tasks.task10.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.tasks.task10.Book;
import sda.tasks.task10.BookRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

// Klasa serwisu
@Service
public class BookService {

    private final BookRepository bookRepository;

    // Wstrzyknięcie zależności do repozytorium
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Metoda do pobierania wszystkich książek
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Metoda do pobierania książki po id
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Book not found with id: " + id));
    }

    // Metoda do dodawania nowej książki
    public Book addBook(Book book) {

        return bookRepository.save(book);
    }

    // Metoda do aktualizowania istniejącej książki
    public Book updateBook(Long id, Book book) {
        Book existingBook = getBookById(id); // sprawdzenie czy książka istnieje
        existingBook.setTitle(book.getTitle()); // ustawienie nowego tytułu
        existingBook.setAuthor(book.getAuthor()); // ustawienie nowego autora
        existingBook.setISBN(book.getISBN()); // ustawienie nowego ISBN
        existingBook.setPagesNum(book.getPagesNum()); // ustawienie nowej liczby stron
        return bookRepository.save(existingBook); // zapisanie zmienionej książki
    }

    // Metoda do usuwania książki po id
    public void deleteBook(Long id) {
        bookRepository.deleteById(id); // usunięcie książki z bazy danych
    }
}
