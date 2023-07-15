package shape;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape {

    private double length;

    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    @Value("${rectangle.length}")
    public void setLength(double length) {
        this.length = length;
    }

    @Value("${rectangle.width}")
    public void setWidth(double width) {
        this.width = width;
    }
}
