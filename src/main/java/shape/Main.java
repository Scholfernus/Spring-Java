package shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@SpringBootApplication
@EnableAspectJAutoProxy
@Component
public class Main implements CommandLineRunner {

    private final ShapeService shapeService;

    @Autowired
    public Main(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wybierz figurę (kwadrat/prostokąt): ");
        String shapeType = scanner.nextLine().toLowerCase();

        Shape shape;
        double length, width;

        if (shapeType.equals("kwadrat")) {
            shape = new Square();
            System.out.print("Podaj długość boku: ");
            double side = scanner.nextDouble();
            ((Square) shape).setSide(side);
        } else if (shapeType.equals("prostokąt")) {
            System.out.print("Podaj długość: ");
            length = scanner.nextDouble();
            System.out.print("Podaj szerokość: ");
            width = scanner.nextDouble();
            shape = new Rectangle(length, width);
        } else {
            System.out.println("Nieznany typ figury!");
            return;
        }

        shapeService.calculateArea();
        System.out.println("Pole figury: " + shape.calculateArea());
    }

}
