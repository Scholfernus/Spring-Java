package sda.tasks.task10;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity(name = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "author")

    private String author;
    @Column(name = "isbn")

    private String ISBN;
    @Column(name = "pagesNum")
    private Integer pagesNum;
}
