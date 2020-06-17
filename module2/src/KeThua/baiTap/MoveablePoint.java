package KeThua.baiTap;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {

    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] getSpeed = {xSpeed, ySpeed};
        return getSpeed;
    }

    public void move() {
        this.setX(this.getX() + this.xSpeed);
        this.setY(this.getY() + this.ySpeed);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nxSpeed = " + xSpeed +
                "\nySpeed = " + ySpeed +
                "\nArraySpeed = " + Arrays.toString(getSpeed());
    }


    public static void main(String[] args) {
        MoveablePoint point1 = new MoveablePoint(2, 3, 4, 5);
        System.out.println(point1);
        point1.move();
        System.out.println(point1);
    }
}
