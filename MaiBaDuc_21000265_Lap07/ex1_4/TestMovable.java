package ex1.ex1_4;

public class TestMovable {
    public static void main(String[] args){
        MovablePoint p1 = new MovablePoint(1,1,2,2);
        System.out.println(p1);
        p1.moveUp();
        p1.moveLeft();
        p1.moveRight();
        p1.moveDown();
        System.out.println(p1);

        MovableCircle cc1 = new MovableCircle(1,1,2,2,1);
        System.out.println(cc1);
        cc1.moveUp();
        cc1.moveLeft();
        cc1.moveRight();
        cc1.moveDown();
        System.out.println(cc1);
    }
}
