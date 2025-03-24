package no.bugs.homework3.task2;

// Задача 2: Класс для представления банковского счета
public class BankAccount {
    private long accountNumber;
    private double balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    double deposit(double amount) {
        balance += amount;
        return balance;
    }


    double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств");
        }
        return balance;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(50.0);
        System.out.println("Текущий баланс: " + bankAccount.getBalance());
        System.out.println("Пополнение на 10: " + bankAccount.deposit(10.0));
        System.out.println("Снятие 30: " + bankAccount.withdraw(30.0));
        System.out.println("Текущий баланс: " + bankAccount.getBalance());
    }
}