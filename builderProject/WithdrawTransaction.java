//Nilofar Ali
//CSC 413
//Spring 2024
//AAssignment 5

class WithdrawTransaction implements TransactionInterface {
    private BankCustomer account;
    private double amount;

    public WithdrawTransaction(BankCustomer account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.withdraw(amount);
    }
}