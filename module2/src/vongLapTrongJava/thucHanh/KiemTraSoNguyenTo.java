package vongLapTrongJava.thucHanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhập 1 số: ");
        int num= scanner.nextInt();
        if (num < 2)
            System.out.println(num + " không phải là số nguyên tố");
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(num + " là số nguyên tố");
            else
                System.out.println(num + " không phải là số nguyên tố");
        }
    }
}
