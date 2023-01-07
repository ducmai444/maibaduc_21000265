package AbstractFactory.Factory1;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String shapeType){
        if (shapeType.equals("Rectangle")) return new RoundedRectangle();
        if (shapeType.equals("Square")) return new RoundedSquare();
        return null;
    }
}
