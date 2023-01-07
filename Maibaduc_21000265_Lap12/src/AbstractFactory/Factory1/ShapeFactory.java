package AbstractFactory.Factory1;

public class ShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String shapeType) {
        if (shapeType.equals("Square")) return new Square();
        if (shapeType.equals("Rectangle")) return new Rectangle();
        return null;
    }
}
