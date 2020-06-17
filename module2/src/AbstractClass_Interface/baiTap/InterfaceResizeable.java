package AbstractClass_Interface.baiTap;

public class InterfaceResizeable {
    public static void main(String[] args) {
        Shape[] arr=new Shape[3];
        arr[0]= new Circle(5);
        arr[1]= new Rectangle(5,10);
        arr[3]= new Square(5);
        for (Shape Obj:arr){
            Obj.Area();
            System.out.println(Obj.toString());
        }
    }

}
