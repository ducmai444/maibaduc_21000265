package ex1.ex1_4;

public class TestShape {
    public static void main(String[] args){
        Shape shape = new Shape();
        System.out.println(shape);
        shape.setColor("green");
        shape.setFilled(false);
        System.out.println(shape);

        Circle circle1 = new Circle();
        System.out.println(circle1);
        circle1.setColor("black");
        circle1.setRadius(4);
        circle1.setFilled(false);
        System.out.println(circle1);
        
        Circle circle2 = new Circle(2, "red", false);
        circle2.setColor("brown");
        System.out.println(circle2);
        System.out.println(circle2.getArea()); 
        System.out.println(circle2.getPerimeter());

        Rectangle rectangle = new Rectangle(1,2,"white",true);
        System.out.println(rectangle.getPerimeter());
        rectangle.setWidth(2);
        System.out.println(rectangle.getPerimeter());

        Square  square = new Square(2);
        System.out.println(square.getPerimeter());
        Square square2 = new Square(3,"red",true);
        square2.setColor("blue");
        square2.setSide(4);
        System.out.println(square2.getPerimeter());
        System.out.println(square2);
    }
}
