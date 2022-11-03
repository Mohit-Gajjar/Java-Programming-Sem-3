package Part6.Practical3;
public class Practical3 extends Thread
{
    private int Count; public int getCount() {
    return Count;
    }
    
    public void setCount(int count) { Count = count;
    }
    
    public void Practical3()
    {
    Count=0;
    }
    
    public void run()
    {
    try
    {
    for(int i=0;i<2;i++)
    {
    System.out.println("The value of Counter : " +
    (++Count));
    Thread.sleep(1000);
    }
    
    System.out.println("\nID:D22CE163 \nName : Mohit Gajjar");
    
    }
    catch(Exception e)
    {
    System.out.println("Exception occured!");
    }
    }
    }
    
    