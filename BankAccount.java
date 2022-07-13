public class BankAccount {
    private String accountOwner;
    private double balance;

    public BankAccount(String owner, double bal){
        accountOwner = owner;
        balance = bal;
    }
    public String getAccountOwner(){
        return accountOwner;
    }
    public double getBalance(){
        return balance;
    }
    public double deposit(double d){
        balance += d;
        return balance;
    }
    public double withdrawal(double d){
        balance -= d;
        return balance;
    }
    public String toString(){
        String str = new String("");
        str += "Account name: " + accountOwner + "\t\tbalance: " + balance ;
        return str;
    }
}
