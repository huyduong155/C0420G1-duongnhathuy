package AbstractClass_Interface.baiTap;

public abstract class Shape implements Resizeable {
public abstract double Area();

    @Override
    public double resize(double Area ,double percent) {
        return Area*(1+percent/100);
    }
}
