package ex2.ex2_2;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return this.base.getArea() * height;
    }

    public double getRadius(){
        return this.base.getRadius();
    }
    public double getArea() {
        return this.base.getArea() * 2 + 2 * Math.PI * this.base.getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString()
                + " height=" + height;
    }

}
