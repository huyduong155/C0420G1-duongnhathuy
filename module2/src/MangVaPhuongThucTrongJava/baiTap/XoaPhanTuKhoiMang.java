package MangVaPhuongThucTrongJava.baiTap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int []arr = {4, 12, 5, 1, 10, 6, 9};
        Scanner scanner= new Scanner(System.in);
        System.out.print("nhập số cần xóa ");
        int x= scanner.nextInt();
        for (int i=0;i<arr.length;i++){
            if (x==arr[i]){
                for (int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                System.out.print("new aray: ");
                System.out.println(Arrays.toString(arr));
            }
            }
        }
    }

