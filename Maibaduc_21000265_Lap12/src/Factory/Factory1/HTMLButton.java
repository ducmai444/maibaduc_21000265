package Factory.Factory1;

public class HTMLButton implements Button{

    @Override
    public void render() {
        System.out.println("render");
    }

    @Override
    public void onClick() {
        System.out.println("onclick");
    }
}
