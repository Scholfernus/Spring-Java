package sda.tasks.task7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShapeService {
    // pole przechowujące wstrzyknięte ziarno typu Shape
    private Shape shape;

    // konstruktor przyjmujący ziarno typu Shape jako argument
    @Autowired
    public ShapeService(Shape shape) {
        this.shape = shape;
    }

    // metoda obliczająca i zwracająca pole figury
    public double calculateArea() {
        // wywołanie metody area() na wstrzykniętym ziarnie
        double area = shape.area();
        // wyświetlenie wyniku w konsoli
        System.out.println("The area of the shape is: " + area);
        // zwrócenie wyniku
        return area;
    }
}

