package ex1.ex1_7;

public class BigDog extends Dog {

    @Override
    public void greeting() {
        System.out.println("Wooow");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("Woooooow");
    }

    public void greeting(BigDog another) {
        System.out.println("Woooooooooow");
    }
}

