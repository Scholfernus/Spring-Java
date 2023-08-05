package sda.tasks.task10;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name = "books")
@Data
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String author;
    private String ISBN;
    private Integer pagesNum;
}
