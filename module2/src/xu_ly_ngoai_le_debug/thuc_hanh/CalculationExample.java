package xu_ly_ngoai_le_debug.thuc_hanh;

import java.util.Scanner;

public class CalculationExample {
    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x,y: " + a);
            System.out.println("Hiệu x,y: " + b);
            System.out.println("Tích x,y: " + c);
            System.out.println("Thương x,y: " + d);
        } catch (Exception e) {
            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        CalculationExample calculationExample = new CalculationExample();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập x: ");
        int x = scanner.nextInt();
        System.out.print("Nhập y: ");
        int y = scanner.nextInt();
        calculationExample.calculate(x, y);
    }
}
