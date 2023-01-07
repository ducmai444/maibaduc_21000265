package Builder.Phone;

public class Order {
    private IPhone iphone;
    private Samsung samsung;
    private OrderType orderType;
    private Color color;

    public Order(IPhone iphone, Samsung samsung, OrderType orderType, Color color) {
        super();
        this.iphone = iphone;
        this.samsung = samsung;
        this.orderType = orderType;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone " + iphone + " " + samsung + ", color: " + color + ", order type: " + orderType;
    }

    public IPhone getIphone() {
        return iphone;
    }

    public Samsung getSamsung() {
        return samsung;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public Color getColor() {
        return color;
    }
}
