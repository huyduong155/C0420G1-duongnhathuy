package KeThua.baiTap;

import java.util.Arrays;

public class Point3D extends Point2D {
    float Z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.Z = z;
    }

    public float getZ() {
        return Z;
    }

    public void setZ(float z) {
        Z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.getX();
        super.getY();
        this.Z = z;
    }

    public float[] getXYZ() {
        float[] getXYZ = {getX(), getY(), this.Z};
        return getXYZ;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nZ = " + Z
                + "\nArray[x,y,z] = " + Arrays.toString(getXYZ());
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(3, 5, 7);
        System.out.println(point3D);
    }
}
