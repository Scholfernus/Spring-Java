package sda.tasks.task9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomBooleanController {

    // pole przechowujące wstrzyknięte ziarno typu RandomBooleanProvider
    private final RandomBooleanProvider randomBooleanProvider;

    // konstruktor przyjmujący ziarno typu RandomBooleanProvider jako argument
    @Autowired
    public RandomBooleanController(RandomBooleanProvider randomBooleanProvider) {
        this.randomBooleanProvider = randomBooleanProvider;
    }

    @GetMapping("/api/random-boolean")
    public boolean getRandomBoolean() {
        // wywołaj metodę getValue() na wstrzykniętym ziarnie i zwróć jej wynik
        return randomBooleanProvider.getValue();
    }
}