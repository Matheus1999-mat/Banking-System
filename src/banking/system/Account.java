
package banking.system;


public abstract class Account implements IAccount{
    private static int MODEL_AGENCY=1;
    private static  int SEQUENCIAL = 1;
    protected int agency;
    protected int number;
    protected double bankbalance;
    
    
    
    //private static int MODEL_AGENCY=0;
    public Account() {//It is a constructor.
        this.agency = Account.MODEL_AGENCY;
        this.number =  SEQUENCIAL++;
    }
    
    
//    public void withdraw(){
//    
//    }
//    public void deposit(){
//    
//    }
//    public void transfer(){
//    
//    
    @Override 
    public void withdraw(double value) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        bankbalance-=value;
    }

    @Override
    public void deposit(double value) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        bankbalance+=value;
        
    }

    @Override
    public void transfer(double value, IAccount accountdestiny) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.withdraw(value);
        accountdestiny.deposit(value);
        
        
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBankbalance() {
        return bankbalance;
    }
    
    protected void printInformationsBankBalance() {
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Number: %d", this.number));
        System.out.println(String.format("Bank Balance %2f", this.bankbalance));
        
        //System.out.println(this.agency);
        //System.out.println(this.number);
        //System.out.println(this.bankbalance);
    }

    
    
    
}
