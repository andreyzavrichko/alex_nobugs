package no.bugs.homework3.task8;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("Проценты не начисляются!");
    }

}
