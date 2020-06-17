package KeThua.baiTap;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume() {
        return super.Area() * height;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nA Cylinder with height = " + height
                + "\nVolume = " + volume();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5, "red", 5);
        System.out.println(cylinder);
    }
}
