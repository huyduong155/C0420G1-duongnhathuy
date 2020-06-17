package KeThua.baiTap;

public class Triangle extends Shape {
    private double size1 = 1.0;
    private double size2 = 1.0;
    private double size3 = 1.0;

    public Triangle() {

    }

    public Triangle(String color, boolean filled, double size1, double size2, double size3) {
        super(color, filled);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    @Override
    public double getPerimeter() {
        return size1 + size2 + size3;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - size1) * (p - size2) * (p - size3));
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nC1 = " + size1 + "\tC2 = " + size2 + "\tC3 = " + size3
                + "\nPerimeter = " + getPerimeter()
                + "\nArea = " + getArea();
    }

    public static void main(String[] args) {
        Shape triangle1 = new Triangle();
        System.out.println(triangle1);
        Shape triangle2 = new Triangle("blue", true, 3, 4, 5);
        System.out.println(triangle2);
    }
}
