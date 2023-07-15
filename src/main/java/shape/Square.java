package shape;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Square implements Shape {

    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void setSide(double side) {
        this.side = side;
    }

}
