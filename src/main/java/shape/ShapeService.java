package shape;

import org.springframework.stereotype.Service;

@Service
public class ShapeService {
private final Shape shape;

    public ShapeService(Shape shape) {
        this.shape = shape;
    }
    public double calculateArea() {
        return shape.calculateArea();
    }
}
