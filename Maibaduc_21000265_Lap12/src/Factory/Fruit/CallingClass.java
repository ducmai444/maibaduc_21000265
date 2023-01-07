package Factory.Fruit;

public class CallingClass {
    public static void main(String[] args){
        Fruit fruit = FruitFactory.getFruit("Banana");
        System.out.println(fruit.getFruit());
    }
}
