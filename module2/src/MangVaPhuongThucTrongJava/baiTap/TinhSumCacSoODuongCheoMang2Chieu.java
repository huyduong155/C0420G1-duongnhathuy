package MangVaPhuongThucTrongJava.baiTap;

import java.util.Arrays;
import java.util.Scanner;

public class TinhSumCacSoODuongCheoMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int x = scanner.nextInt();
        int[][] array = new int[x][x];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Nhập phần tử mảng: ");
                int num = scanner.nextInt();
                array[i][j] = num;
            }
        }
        System.out.print("array = ");
        System.out.println(Arrays.deepToString(array));
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i][i];
        }
        System.out.println("Tổng đường chéo là: " + total);
    }
}
