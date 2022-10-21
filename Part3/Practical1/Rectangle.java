package Part3.Practical1;

public class Rectangle extends GeometricObject {
    double width = 1.2;
    double height = 2.1;

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return 2 * height + width;
    }
}
