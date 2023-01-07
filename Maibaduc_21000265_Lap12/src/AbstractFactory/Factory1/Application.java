package AbstractFactory.Factory1;

public class Application {
    public static void main(String[] args){
        FactoryProducer factoryProducer = new FactoryProducer();
        Shape rectangle = factoryProducer.getFactory("Shape factory").getShape("Rectangle");
        System.out.println(rectangle);
    }
}
