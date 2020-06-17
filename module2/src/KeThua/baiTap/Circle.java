package KeThua.baiTap;

public class Circle {
    private double radius = 1.0;
    private String color = "blue";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double Area() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + radius +
                "\nColor: " + color +
                "\n area = " + Area();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5, "red");
        System.out.println(circle);
    }
}
