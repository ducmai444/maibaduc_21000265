package Singleton.MySingleton;

import java.util.HashMap;

public class Ball {
    private String color;
    private static Ball instance;

    private static HashMap<String, Ball> map = new HashMap<>();
    private Ball(String color){
        this.color = color;
    }

    public static Ball getInstance(String color){
        if (instance == null){
            instance = new Ball(color);
        }
        return instance;
    }
    public String getColor(){
        return color;
    }
}
