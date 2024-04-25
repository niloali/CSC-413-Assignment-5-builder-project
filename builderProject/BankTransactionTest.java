//Nilofar Ali
//CSC 413
//Spring 2024
//AAssignment 5

public class BankTransactionTest {
    public static void main(String[] args) {
        // Create BankCustomer object using Builder
        BankCustomer account1 = new BankCustomer.Builder()
                .withName("John Doe")
                .withAccountNumber("123456789")
                .withBalance(1000)
                .build();
        BankCustomer account2 = new BankCustomer.Builder()
                .withName("John Doe")
                .withAccountNumber("123456789")
                .withBalance(1000)
                .build();


        // Create deposit and withdraw transactions
        DepositTransaction depositTransaction1 = new DepositTransaction(account1, 500);
        WithdrawTransaction withdrawTransaction1 = new WithdrawTransaction(account1, 200);

        // Execute transactions
        BankAccountTransaction depositBankTransaction1 = new BankAccountTransaction("1", "Deposit", 500, "Deposit transaction",
                null, null);
        depositBankTransaction1.executeTransaction(depositTransaction1);

        System.out.println("Balance of account1 after deposit: " + account1.getBalance());

        BankAccountTransaction withdrawBankTransaction1 = new BankAccountTransaction("2", "Withdraw", 200, "Withdraw transaction",
                null, null);
        withdrawBankTransaction1.executeTransaction(withdrawTransaction1);

        System.out.println("Balance of account1 after withdrawal: " + account1.getBalance());

        // Create transfer transaction
        TransferTransaction transferTransaction = new TransferTransaction(account1, account2, 300);

        // Execute transfer transaction
        BankAccountTransaction transferBankTransaction = new BankAccountTransaction("3", "Transfer", 300, "Transfer transaction",
                account1, account2);
        transferBankTransaction.executeTransaction(transferTransaction);


        System.out.println("Balance of account1 after transfer: " + account1.getBalance());
        System.out.println("Balance of account2 after transfer: " + account2.getBalance());

    }
}