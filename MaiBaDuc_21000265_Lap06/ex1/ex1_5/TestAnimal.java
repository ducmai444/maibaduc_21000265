package ex1.ex1_5;

public class TestAnimal {
    public static void main(String[] args){
        Animal animal = new Animal("Ki");
        System.out.println(animal);

        Mammal mammal = new Mammal("TT");
        System.out.println(mammal);
        
        Cat cat = new Cat("Miu");
        cat.greets();
        System.out.println(cat);

        Dog dog = new Dog("Lu");
        Dog dog1 = new Dog("V");
        System.out.println(dog);
        dog.greets();
        dog.greets(dog1);
    }
}
