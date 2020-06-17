package vongLapTrongJava.baiTap;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần tìm: ");
        int num= scanner.nextInt();
        String text=" ";
        int N=2;
        int i;
        int count=0;
        while (count<num){
            for (i=2;i<N;i++){
                if (N%i==0){
                    break;
                }
            }
            if (i==N){
                text=text+N+" ";
                count++;
            }
            N++;

        }
        System.out.println("các số nguyên tố: "+text);
    }
}
