package LopVaDoiTuongTrongJava.baiTap;

public class Fan {
    final int slow = 1, medium = 2, fast = 3;
    private int speed;
    private double radius;
    private boolean On;
    private String Color;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setOn(boolean on) {
        On = on;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public boolean isOn() {
        return On;
    }

    public String getColor() {
        return Color;
    }

    public Fan() {
        this.speed = slow;
        this.On = false;
        this.radius = 5;
        this.Color = "blue";
    }

    @Override
    public String toString() {
        return "Speed: " + this.speed + "\nStatus: " + this.On + "\nRadius: " + this.radius + "\nColor: " + this.Color;
    }

    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println("Fan: " + fan.toString());
        System.out.println("");
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.fast);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(false);
        System.out.println("Fan2: " + fan1.toString());

    }
}
