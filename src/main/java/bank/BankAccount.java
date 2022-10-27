package bank;

public class BankAccount {
    private int balance;

    public BankAccount(){
        balance = 10000;
    }

    int getBalance(){
        return balance;
    }

    boolean setBalance(int balance, int password){
        Password password1 = new Password();
        if (password == password1.getPassword()){
            this.balance = balance;
        return true;
        }
            this.balance = 0;
            return false;
    }
}
