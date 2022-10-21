package Part3.Practical1;

public class Circle extends GeometricObject{
    double radius = 2;
    @Override
    double getArea() {
        return 3.14 * radius * radius;
    }
    @Override
    double getPerimeter(){
        return 2 * 3.14 * radius;
    }
}
