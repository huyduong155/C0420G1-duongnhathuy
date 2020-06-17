package MangVaPhuongThucTrongJava.baiTap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[]array1= new int[5];
        int[]array2= new int[5];
        int[]array3= new int[array1.length+array2.length];
        for (int i=0;i<array1.length;i++){
            System.out.print("nhập phần tử mảng 1 ");
            int num1= scanner.nextInt();
            array1[i]=num1;
        }
        System.out.print("mảng 1 = ");
        System.out.println(Arrays.toString(array1));
        for (int i=0;i<array2.length;i++){
            System.out.print("nhập phần tử mảng 2 ");
            int num2= scanner.nextInt();
            array2[i]=num2;
        }
        System.out.print("mảng 2 = ");
        System.out.println(Arrays.toString(array2));
        for (int i=0;i<array1.length;i++){
            array3[i] = array1[i];
        }
        for (int i=array1.length,j=0;i<array3.length;i++,j++){
            array3[i] = array2[j];
        }
        System.out.print("new array = ");
        System.out.println(Arrays.toString(array3));
    }
}
