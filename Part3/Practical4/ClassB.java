package Part3.Practical4;

public class ClassB extends ClassA {
    private int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void display() {
        System.out.println("Value of b : " + b);
    }
}
