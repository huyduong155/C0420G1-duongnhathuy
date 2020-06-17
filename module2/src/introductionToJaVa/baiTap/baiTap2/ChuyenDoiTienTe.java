package introductionToJaVa.baiTap.baiTap2;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhập USD: ");
        double USD= scanner.nextDouble();
        double VND= USD*23000;
        System.out.print("VND: "+VND);
    }
}
