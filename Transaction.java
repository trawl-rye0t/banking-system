public class Transaction {
    private Customer customer;
    private Account account;
    private TransactionType type;
    private double amount;

    public Transaction(Customer customer, Account account, TransactionType type, double amount) {
        this.customer = customer;
        this.account = account;
        this.type = type;
        this.amount = amount;
    }

    public void process() {
        switch (type) {
            case DEPOSIT:
                account.deposit(amount);
                break;
            case WITHDRAWAL:
                account.withdraw(amount);
                break;
        }
    }
}
