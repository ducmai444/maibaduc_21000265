package Decorator.IceCream;

public class NutsToppingDecorator extends ToppingDecorator{
    public IceCream iceCream;

    public NutsToppingDecorator(IceCream iceCream1) {
        super(iceCream1);
    }

    @Override
    public String getDescription(){
        return "Ice cream with nuts topping";
    }
    @Override
    public String addTopping(){
        return "Be added topping";
    }
}
