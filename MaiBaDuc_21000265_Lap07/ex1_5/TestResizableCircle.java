package ex1.ex1_5;

public class TestResizableCircle {
    public static void main(String[] args){
        ResizableCircle c1 = new ResizableCircle(2.0);
        System.out.println(c1);
        c1.resize(100);
        System.out.println(c1);
    }
}
