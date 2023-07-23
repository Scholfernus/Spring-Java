package sda.tasks.task7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Task7Application {

    // pole przechowujące wstrzyknięte ziarno typu ShapeCalculator
    private final ShapeCalculator shapeCalculator;

    // konstruktor przyjmujący ziarno typu ShapeCalculator jako argument
    @Autowired
    public Task7Application(ShapeCalculator shapeCalculator) {
        this.shapeCalculator = shapeCalculator;
    }

    public static void main(String[] args) {
        // uruchom aplikację i zapisz zwrócony obiekt typu ConfigurableApplicationContext
        ConfigurableApplicationContext context = SpringApplication.run(Task7Application.class,args);
        // rzutuj zwrócony obiekt na typ Task7Application
        Task7Application app = (Task7Application) context.getBean("task7Application");
        // wywołaj metodę run() na polu shapeCalculator tego obiektu
        app.shapeCalculator.run();
    }

}
