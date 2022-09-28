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
