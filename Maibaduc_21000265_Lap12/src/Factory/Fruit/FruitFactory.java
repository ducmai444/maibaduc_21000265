package Factory.Fruit;

public class FruitFactory {
    private FruitFactory(){
    }
    public static final Fruit getFruit(String fruit){
        if (fruit.equals("Banana")){
            return new Banana();
        } else if (fruit.equals("Apple")){
            return new Apple();
        } else if (fruit.equals("Orange")){
            return new Orange();
        } else {
            throw new IllegalArgumentException("No fruit");
        }
    }
}
