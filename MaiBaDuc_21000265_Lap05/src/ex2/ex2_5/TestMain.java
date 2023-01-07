package ex2.ex2_5;

public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(123, "Duy", 'm');
        System.out.println(customer1);

        System.out.println("id is: " + customer1.getID());
        System.out.println("name is: " + customer1.getName());
        System.out.println("gender is: " + customer1.getGender());

        Account account1 = new Account(234, customer1);
        System.out.println(account1);
        account1 = new Account(456, customer1, 1000.0);
        System.out.println(account1);

        account1.setBalance(1500);
        System.out.println(account1);
        account1.deposit(500);
        System.out.println(account1);
        account1.withdraw(3000);
        System.out.println(account1);
        account1.withdraw(1000);
        System.out.println(account1);
        System.out.println("id is: " + account1.getId());
        System.out.println("customer is: " + account1.getCustomer());
        System.out.println("balance is: " + account1.getBalance());
        System.out.println("customer name is: " + account1.getCustomerName());

    }
}
