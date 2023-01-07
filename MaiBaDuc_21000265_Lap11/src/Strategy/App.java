package Strategy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Context context = new Context();

        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();
        sc.close();

        switch (c) {
            case "+" -> context.setStrategy(new ConcreteStrategyAdd());
            case "-" -> context.setStrategy(new ConcreteStrategySubstract());
            case "*" -> context.setStrategy(new ConcreteStrategyMultiple());
        }
        System.out.println("result " + context.executeStrategy(a, b));
    }
}
