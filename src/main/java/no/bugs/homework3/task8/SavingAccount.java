package no.bugs.homework3.task8;

public class SavingAccount extends BankAccount {
    public SavingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void calculateInterest() {
        double interest = getBalance() * 0.05;
        setBalance(getBalance() + interest);
    }
}
