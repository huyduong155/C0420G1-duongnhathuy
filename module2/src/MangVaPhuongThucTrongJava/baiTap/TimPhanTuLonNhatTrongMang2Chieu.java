package MangVaPhuongThucTrongJava.baiTap;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[][] array= new int[3][3];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print("Nhập phần tử mảng: ");
                int num = scanner.nextInt();
                array[i][j]=num;
            }
        }
        System.out.print("array = ");
        System.out.println(Arrays.deepToString(array));
        int max = array[0][0];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
            if (array[i][j] > max){
                max = array[i][j];
            }
            }
        }
        System.out.print("max = "+ max);
    }
}
