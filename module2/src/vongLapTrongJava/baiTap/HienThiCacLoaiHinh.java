package vongLapTrongJava.baiTap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1.Draw the rectangle");
        System.out.println("2.Draw the square triangle");
        System.out.println("3.Draw the triangle");
        System.out.println("4.Exit");
        System.out.print("Enter your choice: ");
        int choice= scanner.nextInt();
        while (choice!=0){
            switch (choice){
                case 1:
                    System.out.println("Draw the rectangle");
                    for (int i=0;i<3;i++){
                        System.out.println("");
                      for (int j=0;j<7;j++){
                          System.out.print("*");
                      }
                    }
                    choice=0;
                    break;
                case 2:
                    System.out.println("2.Draw the square triangle");
                    for (int i=0;i<=5;i++){
                        System.out.println("");
                        for (int j=0;j<i;j++){
                            System.out.print("*");
                        }
                    }
                    choice=0;
                    break;
                case 3:
                    System.out.println("3.Draw the triangle");
                    for (int i=7;i>=0;i--){
                        System.out.println("");
                        for (int j=0;j<=i;j++){
                            System.out.print("*");
                        }
                    }
                    choice=0;
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice");
                    }
            }

    }
}
