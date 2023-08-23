public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0);

        System.out.println("Initial Balance: $" + account.getBalance());

        account.deposit(500.0);
        System.out.println("After Deposit: $" + account.getBalance());
    }
}

