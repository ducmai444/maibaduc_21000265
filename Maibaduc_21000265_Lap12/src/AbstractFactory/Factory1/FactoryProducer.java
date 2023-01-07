package AbstractFactory.Factory1;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if (factory.equals("Shape factory")){
            return new ShapeFactory();
        } else if (factory.equals("Rounded shape factory")){
            return new RoundedShapeFactory();
        }
        return null;
    }
}
