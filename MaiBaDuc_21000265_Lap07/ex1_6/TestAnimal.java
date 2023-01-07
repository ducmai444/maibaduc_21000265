package ex1.ex1_6;

public class TestAnimal {
    public static void main(String[] args){
        Cat cat1 = new Cat("Miu");
        cat1.greets();

        Dog dog1 = new Dog("Ki");
        dog1.greets();
        dog1.greets(new Dog("Au"));

        BigDog bd1 = new BigDog("Vo");
        bd1.greets();
        bd1.greets(dog1);
        bd1.greets(new BigDog("Yoh"));
    }
}
