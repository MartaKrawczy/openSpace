package bank;

public class Bank {

    public static void main(String[] args) {
        BankAccount savings = new BankAccount();
        savings.setBalance(savings.getBalance(), 1234);
        System.out.println("You can withdraw from your account to " + savings.getBalance() +"zł");
    }
}
