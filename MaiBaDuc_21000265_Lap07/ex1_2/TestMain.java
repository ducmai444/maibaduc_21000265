package ex1.ex1_2;

public class TestMain {
    public static void main(String[] args) {
        GeometricObject g1 = new Circle(1.2);
        System.out.println(g1);
        System.out.println(g1.getArea());
        System.out.println(g1.getPerimeter());

        GeometricObject g2 = new Rectangle(1.0, 2.0);
        System.out.println(g2);
        System.out.println(g2.getPerimeter());
        System.out.println(g2.getArea());

//        GeometricObject g3 = new GeometricObject() {
//            @Override
//            public double getArea() {
//                return 0;
//            }
//
//            @Override
//            public double getPerimeter() {
//                return 0;
//            }
//        };

//        GeometricObject g4 = new GeometricObject(); // Cannot be instantiated
    }
}