package MangVaPhuongThucTrongJava.baiTap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {4, 12, 5, 1, 10, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số cần chèn ");
        int x = scanner.nextInt();
        System.out.print("nhập vị trí cần chèn ");
        int index = scanner.nextInt();
        if (index <= 1 || index >= arr.length-1) {
            System.out.print("không chèn được");
        } else {
            for (int i = arr.length - 2; i >= index; i--) {
                arr[i + 1] = arr[i];
            }
            arr[index] = x;
        }
        System.out.print("new array ");
        System.out.println(Arrays.toString(arr));
    }
}


