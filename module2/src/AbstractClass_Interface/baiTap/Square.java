package AbstractClass_Interface.baiTap;

public class Square extends Shape {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                +"\nArea = "+getArea();
    }

    @Override
    public double Area() {
        return getArea();
    }
}
