public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Customer customer1 = new Customer("John Doe");
        Customer customer2 = new Customer("Jane Smith");

        Account account1 = new Account(1000);
        Account account2 = new Account(500);

        customer1.addAccount(account1);
        customer2.addAccount(account2);

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        Transaction transaction1 = new Transaction(customer1, account1, TransactionType.WITHDRAWAL, 200);
        Transaction transaction2 = new Transaction(customer2, account2, TransactionType.DEPOSIT, 300);

        bank.processTransaction(transaction1);
        bank.processTransaction(transaction2);

        System.out.println("Customer 1 Balance: " + account1.getBalance());
        System.out.println("Customer 2 Balance: " + account2.getBalance());
    }
}
