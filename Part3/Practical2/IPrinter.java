package Part3.Practical2;
public interface IPrinter {
    default void show(){
        System.out.println("This is the methord of IPrinter Interface.");
    }
   
}
