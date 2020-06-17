package introductionToJaVa.thucHanh;

import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scaner=new Scanner(System.in);
        System.out.println("Enter width: ");
        width= scaner.nextFloat();
        System.out.println("Enter height: ");
        height= scaner.nextFloat();
        float area= width*height;
        System.out.println("Area is: "+ area);
    }
}
