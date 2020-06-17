package AccessModifier_staticMethod_staticProperty.baiTap;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    protected double getRadius() {
        return radius;
    }

    protected double getArea() {
        final double PI = 3.14;
        return Math.pow(radius, 2) * PI;
    }
}
