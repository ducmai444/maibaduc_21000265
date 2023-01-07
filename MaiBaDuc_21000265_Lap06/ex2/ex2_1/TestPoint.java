package ex2.ex2_1;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        System.out.println(p1);
        p1.setXY(10, 10);
        System.out.println(p1);
        System.out.println(p1.getY());
    }
}