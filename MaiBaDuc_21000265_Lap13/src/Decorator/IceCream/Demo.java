package Decorator.IceCream;

public class Demo {
    public static void main(String[] args){
        IceCream iceCream = new ChocolateIceCream();
        IceCream iceCream1 = new NutsToppingDecorator(new ChocolateIceCream());
        System.out.println(iceCream1.getDescription());

        IceCream iceCream2 = new HoneyToppingDecorator(new VanillaIceCream());
        System.out.println(iceCream2.getDescription());
    }
}
