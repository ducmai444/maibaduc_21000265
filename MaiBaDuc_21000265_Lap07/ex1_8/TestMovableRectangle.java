package ex1.ex1_8;

public class TestMovableRectangle {
    public static void main(String[] args){
        MovableRectangle rt1 = new MovableRectangle(1,1,2,2,3,3);
        System.out.println(rt1);
        rt1.moveUp();
        rt1.moveRight();
        System.out.println(rt1);

        MovableRectangle rt2 = new MovableRectangle(2,2,3,3,1,1);
        System.out.println(rt2);
        rt2.moveUp();
        rt2.moveRight();
        System.out.println(rt2);

    }
}
