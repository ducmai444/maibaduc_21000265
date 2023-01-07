package Builder.Phone;

public class Client {
    public static void main(String[] args){
        Order order = new PhoneOrder().orderIPhone(IPhone.IPhone7).orderColor(Color.Black).orderType(OrderType.ON_SITE).build();
        System.out.println(order);
    }
}
