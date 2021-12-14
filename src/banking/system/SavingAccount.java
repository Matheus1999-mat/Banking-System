
package banking.system;


public class SavingAccount extends Account{
    
    @Override
    public void printbankbalance(){
        System.out.println("Bank balance - SavingAccount");
        super.printInformationsBankBalance();

    }
    
    
}
