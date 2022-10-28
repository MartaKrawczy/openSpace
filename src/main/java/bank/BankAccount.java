package bank;

 class BankAccount {
    private int balance;


    BankAccount(){
        balance = 10000;
    }

    int getBalance(){
        this.balance = balance;
        return balance;
    }

    boolean setBalance(int balance, int password){
        System.out.println("Please enter your account pin: ");
        Password password1 = new Password();
        if (password == password1.getPassword()){
            System.out.println("Account balance: " + balance+"zł");
            System.out.println("How much money do you want to withdraw: ");
            CashMachine cashMachine = new CashMachine();
            this.balance = balance - cashMachine.getPayOff();
            System.out.println("Actual account balance: " + this.balance+"zł");
        return true;
        }
            this.balance = 0;
            return false;
    }
}
