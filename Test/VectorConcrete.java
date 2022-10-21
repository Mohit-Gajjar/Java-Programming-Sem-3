package Test;
import Part3.Practical2.IPrinter;
import Part3.Practical2.IScanner;

public class VectorConcrete implements IPrinter, IScanner {

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
