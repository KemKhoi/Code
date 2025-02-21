public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer(101, "Alice", 'f');

        Account account1 = new Account(5001, customer1, 1000.0);

        System.out.println(account1);

        System.out.println("Customer Name: " + account1.getCustomerName());

        account1.deposit(500.0);
        System.out.println("After deposit: " + account1);

        account1.withdraw(300.0);
        System.out.println("After withdraw: " + account1);

        account1.withdraw(1500.0);
        System.out.println("Final account state: " + account1);
    }
}