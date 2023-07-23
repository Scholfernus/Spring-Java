package sda.tasks.task7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ShapeCalculator {

    // pole przechowujące obiekt typu Scanner do czytania danych z konsoli
    private Scanner scanner;

    // konstruktor przyjmujący obiekt typu Scanner jako argument
    @Autowired
    public ShapeCalculator(Scanner scanner) {
        this.scanner = scanner;
    }

    // metoda uruchamiająca kalkulator
    public void run() {
        // zapytaj użytkownika, jaką figurę chce obliczyć
        System.out.println("Which shape do you want to calculate? (square or circle)");
        // wczytaj odpowiedź użytkownika
        String shape = scanner.nextLine();
        // sprawdź, czy odpowiedź jest poprawna
        if (shape.equalsIgnoreCase("square")) {
            // jeśli użytkownik wybrał kwadrat, zapytaj o długość boku
            System.out.println("Enter the side length of the square:");
            // wczytaj długość boku
            double side = scanner.nextDouble();
            // utwórz obiekt typu Square z podaną długością boku
            Square square = new Square(side);
            // oblicz i wyświetl pole kwadratu
            System.out.println("The area of the square is: " + square.area());
        } else if (shape.equalsIgnoreCase("circle")) {
            // jeśli użytkownik wybrał koło, zapytaj o promień
            System.out.println("Enter the radius of the circle:");
            // wczytaj promień
            double radius = scanner.nextDouble();
            // utwórz obiekt typu Circle z podanym promieniem
            Circle circle = new Circle(radius);
            // oblicz i wyświetl pole koła
            System.out.println("The area of the circle is: " + circle.area());
        } else {
            // jeśli użytkownik podał niepoprawną odpowiedź, wyświetl komunikat o błędzie
            System.out.println("Invalid shape. Please enter square or circle.");
        }
    }
}
