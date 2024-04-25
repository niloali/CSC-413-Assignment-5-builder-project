//Nilofar Ali
//CSC 413
//Spring 2024
//AAssignment 5

class TransferTransaction implements TransactionInterface {
    private BankCustomer sourceAccount;
    private BankCustomer destinationAccount;
    private double amount;

    public TransferTransaction(BankCustomer sourceAccount, BankCustomer destinationAccount, double amount) {
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
    }

    @Override
    public void execute() {
        sourceAccount.transfer(destinationAccount, amount);
    }
}