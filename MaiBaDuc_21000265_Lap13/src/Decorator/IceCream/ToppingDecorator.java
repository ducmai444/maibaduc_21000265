package Decorator.IceCream;

public abstract class ToppingDecorator implements IceCream {
    public IceCream iceCream;
    public ToppingDecorator(IceCream iceCream1){
        this.iceCream = iceCream1;
    }
    public String getDescription(){
        return "Ice cream has toppings";
    }
    public String addTopping(){
        return "Adding topping to ice cream";
    }
}
