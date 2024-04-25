//Nilofar Ali
//CSC 413
//Spring 2024
//AAssignment 5

class DepositTransaction implements TransactionInterface {
    private BankCustomer account;
    private double amount;

    public DepositTransaction(BankCustomer account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.deposit(amount);
    }
}