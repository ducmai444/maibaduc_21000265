package Decorator.IceCream;

public class HoneyToppingDecorator extends ToppingDecorator{
    public IceCream iceCream;

    public HoneyToppingDecorator(IceCream iceCream1) {
        super(iceCream1);
    }

    @Override
    public String getDescription(){
        return "Ice cream with honey topping";
    }
    @Override
    public String addTopping(){
        return "Be added topping";
    }
}
