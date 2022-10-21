package Part3.Practical2;

public class Main implements IPrinter, IScanner {

    @Override
    public void show() {
    }

    @Override
    public String toString() {
        IPrinter.super.show();
        IScanner.super.show();
        return "";
    }
}
