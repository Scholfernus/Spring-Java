package sda.tasks.task7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Scanner;

@Configuration
public class ShapeConfig {
    @Bean
    public Scanner scanner() {
        return new Scanner(System.in); // utwórz obiekt Scanner, który czyta dane z konsoli
    }

    @Bean
    @Profile("square")
    public Shape square() {
        return new Square(10); // bok kwadratu
    }

    @Bean
    @Profile("circle")
    public Shape circle() {
        return new Circle(5); // promień koła
    }
}

