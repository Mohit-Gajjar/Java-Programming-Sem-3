package Part6.Practical2;

import java.util.Random;

//odd thread
class Odd extends Thread {
    int arr[] = new int[15];

    Odd(int arr[]) // constructor
    {
        this.arr = arr;
    }

    public void run() {
        for (int i = 0; i < 15; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(this.arr[i] + " is even");
            }
        }
    }
}

// even thread
class Even extends Thread {
    int arr[] = new int[15];

    Even(int arr[]) // constructor
    {
        this.arr = arr;
    }

    public void run() {
        for (int i = 0; i < 15; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(this.arr[i] + " is odd");
            }
        }
        System.out.println("\nD22CE163\nName : Mohit Gajjar");
    }
}

class Practical2 {
    public static void main(String args[]) {
        int i;
        int arr[] = new int[15];
        Random r = new Random(); // use of random class 
        for(i=0; i<arr.length; i++)
        {
            arr[i] = r.nextInt(100);
        }
        Odd obj1 = new Odd(arr); // calling constructor 
        Even obj2 = new Even(arr); //calling constructor
                                 // obj1.start();
        obj2.start();
    }
}
