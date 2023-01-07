package Singleton.MySingleton;

public class AppBall {
    public static void main(String[] args){
        Ball ball = Ball.getInstance("red");
        System.out.println(ball.getColor());

        Ball ball1 = Ball.getInstance("green");
        System.out.println(ball.getColor());

        System.out.println(ball == ball1);

    }
}
