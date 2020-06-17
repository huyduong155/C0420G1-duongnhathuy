package vongLapTrongJava.thucHanh;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a,b;
        System.out.print("Nhập a: ");
        a= scanner.nextInt();
        System.out.print("Nhập b: ");
        b= scanner.nextInt();
        if (a==0 || b==0){
            System.out.print("không có ước chung lớn nhất");
        }else {
            while (a!=b){
                if (a>b){
                    a=a-b;
                }else {
                    b=b-a;
                }
            }
            System.out.print("ước chung lớn nhất là: "+a);
        }

    }
}
