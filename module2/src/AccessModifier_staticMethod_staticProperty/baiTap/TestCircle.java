package AccessModifier_staticMethod_staticProperty.baiTap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}
