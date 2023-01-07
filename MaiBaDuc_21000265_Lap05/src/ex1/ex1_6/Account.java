package ex1.ex1_6;

public class Account {

    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
    }

    public int getBalance() {

        return balance;
    }

    public String getName() {

        return name;
    }

    public String getId() {

        return id;
    }

    public int credit(int amount) {
        this.balance = this.balance + amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
        } else {
            System.out.print("amount exceeded");
        }
        return this.balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= this.balance) {
            another.credit(amount);
            this.balance = this.balance - amount;
        } else {
            System.out.print("amount exceeded");
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account[" + "id='" + id + ", name='" + name + ", balance=" + balance + ']';
    }
}
