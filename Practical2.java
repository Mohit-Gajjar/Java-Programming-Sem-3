// A typical mobile number in India is “+91-AA-BBB-CCCCC”. Where the first two digits (AA)
// indicate a mobile system operator, the next three (BBB) denote the mobile switching code
// (MSC) while the remaining five digits (CCCCC) are unique to the subscriber. Write an
// application that takes a mobile number as an input from a user in above mentioned format
// and display code for mobile system operator, mobile switching code and last 5 digits which
// are unique to subscriber.
// Ex. For an input +91-94-999-65789, output should be :
// Mobile system operator code is 94
// MSC is 999
// Unique code is 65789
import java.util.Scanner;
class Practical2 {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the mobile number in '+91-AA-BBB-CCCCC' format: ");
            String number = sc.next();
            if(number.length() ==  16){
                Generate g = new Generate();
                g.generate(number);
                
            }else {
                System.out.println("Invalid number!!");
            }
    }
       
    }
    
}
class Generate{
    void generate(String number){
        String[] systemOperator  = number.split("-", 3);
        System.out.println(systemOperator);
    }
}