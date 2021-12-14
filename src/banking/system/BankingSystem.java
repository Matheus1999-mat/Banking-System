
package banking.system;
import java.util.Scanner;

public class BankingSystem {
    
    
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Choose an value to deposit:");
          int value = scanner.nextInt();
          
          Account ac=new CheckingAccount();
          Account sa = new SavingAccount();
          
          ac.deposit(value);
          ac.transfer(value, sa);
          ac.printInformationsBankBalance();
          sa.printInformationsBankBalance();
          
    }
    
}
