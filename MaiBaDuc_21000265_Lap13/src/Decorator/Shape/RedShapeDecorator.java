package Decorator.Shape;

public class RedShapeDecorator extends ShapeDecorator{
    public Shape shape;
    public RedShapeDecorator(Shape shape){
        super(shape);
    }
    public void draw(){
        setRedBorder();
    }
    public void setRedBorder(){
        System.out.println("Border: red");
    }
}
