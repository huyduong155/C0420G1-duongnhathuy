package introductionToJaVa.thucHanh;

import java.util.Scanner;

public class TinhChiSoCanNang {
    public static void main(String[] args) {
        double weigh;
        double heigh;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter weigh: ");
        weigh= scanner.nextDouble();
        System.out.println("Enter heigh(m): ");
        heigh= scanner.nextDouble();
        double bmi= weigh/Math.pow(heigh,2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
