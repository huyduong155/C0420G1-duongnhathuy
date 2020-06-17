package KeThua.baiTap;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public double getArea(){
      return 1;
    }
    public double getPerimeter(){
        return 1;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
    public static void main(String[] args) {
        KeThua.thucHanh.Shape shape = new KeThua.thucHanh.Shape();
        System.out.println(shape);

        shape = new KeThua.thucHanh.Shape("red", false);
        System.out.println(shape);
    }
}
