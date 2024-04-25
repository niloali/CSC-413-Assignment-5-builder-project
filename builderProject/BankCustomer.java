//Nilofar Ali
//CSC 413
//Spring 2024
//AAssignment 5

import java.util.Date;
class BankCustomer {
    private String name;
    private String accountNumber;
    private double balance;

    public BankCustomer(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankCustomer{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    public void transfer(BankCustomer destinationAccount, double amount) {
        if (balance >= amount) {
            withdraw(amount);
            destinationAccount.deposit(amount);
        } else {
            System.out.println("Insufficient funds for transfer.");
        }
    }

    // Builder class for BankCustomer
    static class Builder {
        private String name;
        private String accountNumber;
        private double balance;

        public Builder() {}

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder withBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public BankCustomer build() {
            return new BankCustomer(name, accountNumber, balance);
        }
    }
}