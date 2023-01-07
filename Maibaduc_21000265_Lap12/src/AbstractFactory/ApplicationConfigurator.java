package AbstractFactory;
import java.util.Scanner;
import java.io.*;

public class ApplicationConfigurator {
    public static void main(String[] args) throws  Exception{
        Scanner sc = new Scanner(System.in);
        String config = sc.next();
        GUIFactory factory;
//        config = readApplicationConfigFile();
        if (config.equals( "Window")) {
            factory = new WinFactory();
        } else if (config.equals("Mac")) {
            factory = new MacFactory();
        } else {
            throw new Exception("Error! Unknown operating system.");
        }
        Application app = new Application(factory);
        System.out.println(app);
    }
}
