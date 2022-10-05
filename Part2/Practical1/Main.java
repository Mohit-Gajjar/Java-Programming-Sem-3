package Part2.Practical1;

public class Main {
    public static void main(String[] args) {
        Cylinder testCylinder1 = new Cylinder();
        System.out.println(testCylinder1.getArea());
        Cylinder testCylinder2 = new Cylinder(1.3);
        System.out.println(testCylinder2.getArea());
        Cylinder testCylinder3 = new Cylinder(1.3, 1.2);
        System.out.println(testCylinder3.getArea());
    }

}
