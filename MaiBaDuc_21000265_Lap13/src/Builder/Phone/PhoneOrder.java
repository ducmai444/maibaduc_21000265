package Builder.Phone;

public class PhoneOrder implements OrderBuilder{
    private OrderType orderType;
    private IPhone iphone;
    private Samsung samsung;
    private Color color;

    @Override
    public OrderBuilder orderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    @Override
    public OrderBuilder orderIPhone(IPhone iphone) {
        this.iphone = iphone;
        return this;
    }

    @Override
    public OrderBuilder orderSamsung(Samsung samsung) {
        this.samsung = samsung;
        return this;
    }

    @Override
    public OrderBuilder orderColor(Color color) {
        this.color = color;
        return this;
    }

    @Override
    public Order build() {
        return new Order(iphone, samsung, orderType, color);
    }
}
