import java.util.Date;
public class CreateAccount {
   
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(500);
        account.setDate(new Date());
        System.out.println(account);
        
    }
}
