package no.bugs.homework3.task8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(new SavingAccount(1111, 15.5));
        bankAccounts.add(new CheckingAccount(1122, 143.5));

        for (BankAccount account : bankAccounts) {
            System.out.println(account);
            account.deposit(200);
            account.withdraw(100);
            account.calculateInterest();
            System.out.println("Итоговый баланс: " + account.getBalance());
            System.out.println();
        }
    }
}
