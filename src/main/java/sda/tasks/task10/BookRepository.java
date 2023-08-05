package sda.tasks.task10;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitle(String title);

    Book findByISBN(String ISBN);

    Book findByAuthorAndISBN(String author, String ISBN);

    List<Book> findTop3ByAuthorOrderByPagesNumDesc(String author);

    List<Book> findByTitleStartingWith(String prefix);

    List<Book> findByPagesNumGreaterThan(int pagesNum);

    List<Book> findByPagesNumBetween(Integer min, Integer max);
}
