package sda.tasks.task7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("circle") // ta klasa jest aktywna tylko dla profilu circle
public class CircleController {
    // pole przechowujące wstrzyknięte ziarno typu ShapeService
    private ShapeService shapeService;

    // konstruktor przyjmujący ziarno typu ShapeService jako argument
    @Autowired
    public CircleController(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    // metoda obsługująca żądanie GET na ścieżce /area
    @GetMapping("/area")
    public double getArea() {
        // zwrócenie pola koła obliczonego przez serwis
        return shapeService.calculateArea();
    }
}
