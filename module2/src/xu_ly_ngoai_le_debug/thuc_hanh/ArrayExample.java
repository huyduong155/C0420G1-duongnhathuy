package xu_ly_ngoai_le_debug.thuc_hanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] creatRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.creatRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Nhập chỉ số bạn muốn tìm: ");
        int num = scanner.nextInt();
        try {
            System.out.println("Vị trí thứ " + num + " có giá trị: " + arr[num]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Chỉ số bạn nhập vượt quá giới hạn của mảng.");
        }
    }
}
