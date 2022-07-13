public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount a001 = new BankAccount("jimmy", 700);
        System.out.println("balance = " + a001.getBalance());
        System.out.println("new balance = " + a001.deposit(250));
        System.out.println("after withdrawal, balance is: " + a001.withdrawal(500));

    System.out.println(a001.toString());
    }
}
