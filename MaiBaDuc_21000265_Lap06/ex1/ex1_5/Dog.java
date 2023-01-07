package ex1.ex1_5;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Wof");
    }

    public void greets(Dog another) {
        System.out.println("Wooof");
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}
