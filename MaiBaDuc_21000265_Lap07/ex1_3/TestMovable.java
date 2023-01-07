package ex1.ex1_3;

public class TestMovable {
    public static void main(String[] args){
        MovablePoint p1 = new MovablePoint(1,1,2,2);
        System.out.println(p1);
        p1.moveDown();
        p1.moveLeft();
        System.out.println(p1);

        MovablePoint p2 = new MovablePoint(2,2,3,3);
        System.out.println(p2);
        p2.moveUp();
        p2.moveRight();
        System.out.println(p2);
    }
}
