package sda.tasks.task10;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitle(String title);

    Book findByISBN(String ISBN);

    Book findByAuthorAndISBN(String author, String ISBN);
    @Query("SELECT b FROM Book B WHERE b.author = :author ORDER BY b.pagesNUM DESC")
    List<Book>findTop3ByAuthorOrderByPagesNumDesc(@Param("author") String author);
    List<Book>findByTitleStartingWith(String prefix);
    List<Book>findByPagesNumBetween(Integer min, Integer max);
    @Query ("SELECT b FROM Book b WHERE b.pagesNum >= :x")
    List<Book>findWherePagesNumIsGreaterThanX(@Param("x") Integer x);
}
