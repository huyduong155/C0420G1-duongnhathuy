package xu_ly_ngoai_le_debug.bai_tap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleExample {
    private void triangle() throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("--------------------");
            System.out.println("Nhập 3 cạnh của tam giác:");
            System.out.print("Cạnh thứ nhất: ");
            int a = scanner.nextInt();
            System.out.print("Cạnh thứ hai: ");
            int b = scanner.nextInt();
            System.out.print("Cạnh thứ ba: ");
            int c = scanner.nextInt();
            if (a > 0 && b > 0 && c > 0) {
                System.out.println("Ba cạnh của tam giác là: a = " + a + " b = " + b + " c = " + c);

            } else
                throw new IllegalTriangleException("Giá trị cạnh bạn nhập <=0");
            if (a + b > c && a + c > b && b + c > a) {
                int chuvi = a + b + c;
                System.out.println("Chu vi tam giác là: " + chuvi);

            } else
                throw new IllegalTriangleException("Tổng 2 cạnh không lớn hơn cạnh còn lại");
        } catch (InputMismatchException e) {
            throw new IllegalTriangleException("Giá trị phải là một số");
        }
    }

    public static void main(String[] args) {
        TriangleExample tr = new TriangleExample();
        boolean bool=true;
        while (bool){
            try {
                tr.triangle();
                bool=false;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
