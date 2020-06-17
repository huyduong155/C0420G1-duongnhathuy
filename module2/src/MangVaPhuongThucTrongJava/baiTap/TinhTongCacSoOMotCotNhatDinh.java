package MangVaPhuongThucTrongJava.baiTap;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCacSoOMotCotNhatDinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int x = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int y = scanner.nextInt();
        int[][] array = new int[x][y];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Nhập phần tử mảng: ");
                int num = scanner.nextInt();
                array[i][j] = num;
            }
        }
        System.out.print("array = ");
        System.out.println(Arrays.deepToString(array));
        System.out.print("Nhập số cột bạn muốn cộng: ");
        int num = scanner.nextInt();
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i][num];
        }
        System.out.println("Tổng các số trong cột là: " + total);
    }
}
