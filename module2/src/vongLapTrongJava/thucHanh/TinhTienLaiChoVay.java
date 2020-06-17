package vongLapTrongJava.thucHanh;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        double money,laiSuat;
        int month;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhập số tiền: ");
        money=scanner.nextDouble();
        System.out.print("Nhập lãi suất (%): ");
        laiSuat=scanner.nextDouble();
        System.out.print("Nhập số tháng: ");
        month= scanner.nextInt();
        double total=0;
        for (int i=0;i<month;i++){
            total =money*(laiSuat/100)/12*month;
        }
        System.out.print("tổng: "+total);
    }
}
