package ex2.ex2_9;

public class TestTriangle {
    public static void main(String[] args) {
        MyTriangle triangle1 = new MyTriangle(1, 1, 2, 2, 2, 3);
        MyTriangle triangle2 = new MyTriangle(0, 1, 2, 0, -2, 0);
        System.out.println(triangle1);
        System.out.println(triangle2);

        System.out.println("Perimeter is: " + triangle1.getPerimeter());
        System.out.println("triangle 1 is: " + triangle1.getType() + " triangle");
        System.out.println("triangle 2 is: " + triangle2.getType() + " triangle");
    }
}
