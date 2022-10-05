package Part2.Practical1;

public class Cylinder {
    double radius = 1.0;
    double height = 1.0;

    Cylinder() {
        this.radius = 1.0;
        this.height = 1.0;
        System.out.println("Default cylinder created.");
    }

    Cylinder(double radius) {
        this.radius = radius;
        System.out.println("Cylinder created with specified radius.");
    }

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        System.out.println("Cylinder created with specified radius and height.");

    }

    double getArea() {
        return 3.14 * radius * radius * height;
    }
}
