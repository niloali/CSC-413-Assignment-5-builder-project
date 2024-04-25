//Nilofar Ali
//CSC 413
//Spring 2024
//AAssignment 5

import java.util.Date;
class BankAccountTransaction {
    private String id;
    private Date datetime;
    private String type;
    private double amount;
    private String description;
    private String status;
    private BankCustomer sourceAccount;
    private BankCustomer destinationAccount;

    public BankAccountTransaction(String id, String type, double amount, String description,
                                  BankCustomer sourceAccount, BankCustomer destinationAccount) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.datetime = new Date();
        this.status = "Pending";
    }

    public void executeTransaction(TransactionInterface transaction) {
        transaction.execute();
        status = "Completed";
    }
}