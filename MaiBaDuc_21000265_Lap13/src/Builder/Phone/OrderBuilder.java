package Builder.Phone;

public interface OrderBuilder {
    OrderBuilder orderType(OrderType orderType);
    OrderBuilder orderIPhone(IPhone iphone);
    OrderBuilder orderSamsung(Samsung samsung);
    OrderBuilder orderColor(Color color);

    Order build();
}
