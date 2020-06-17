package introductionToJaVa.baiTap.baiTap3;

import java.util.Scanner;

public class DocChuThanhSo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhập số cần đọc: ");
        int num= scanner.nextInt();
        String str="";
        if (num>=0 && num<=10){
            switch (num){
                case 0:
                    str="zero";
                    break;
                case 1:
                    str="one";
                    break;
                case 2:
                    str="two";
                    break;
                case 3:
                    str="three";
                    break;
                case 4:
                    str="four";
                    break;
                case 5:
                    str="five";
                    break;
                case 6:
                    str="six";
                    break;
                case 7:
                    str="seven";
                    break;
                case 8:
                    str="eight";
                    break;
                case 9:
                    str="nine";
                    break;
                case 10:
                    str="ten";
                    break;

            }
            System.out.println(str);
        }else if (num<=20){
            switch (num){
                case 11:
                    str="eleven";
                    break;
                case 12:
                    str="twelve";
                    break;
                case 13:
                    str="thirteen";
                    break;
                case 14:
                    str="fourteen";
                    break;
                case 15:
                    str="fifteen";
                    break;
                case 16:
                    str="sixteen";
                    break;
                case 17:
                    str="seventeen";
                    break;
                case 18:
                    str="eightteen";
                    break;
                case 19:
                    str="nineteen";
                    break;
                case 20:
                    str="twenty";
                    break;
            }
            System.out.print(str);
        }
        int donvi= num%10;
        int chuc= num/10%10;
        int tram= num/100;
        String donvi1="",chuc1="",tram1="";
        switch (donvi){
            case 0:
                donvi1="";
                break;
            case 1:
                donvi1="one";
                break;
            case 2:
                donvi1="two";
                break;
            case 3:
                donvi1="three";
                break;
            case 4:
                donvi1="four";
                break;
            case 5:
                donvi1="five";
                break;
            case 6:
                donvi1="six";
                break;
            case 7:
                donvi1="seven";
                break;
            case 8:
                donvi1="eight";
                break;
            case 9:
                donvi1="nine";
                break;
        }
        switch (chuc){
            case 0:
                chuc1="";
                break;
            case 1:
                chuc1="ten ";
                break;
            case 2:
                chuc1="twenty ";
                break;
            case 3:
                chuc1="thirty ";
                break;
            case 4:
                chuc1="fourty ";
                break;
            case 5:
                chuc1="fifty ";
                break;
            case 6:
                chuc1="sixty ";
                break;
            case 7:
                chuc1="seventy ";
                break;
            case 8:
                chuc1="eightty ";
                break;
            case 9:
                chuc1="ninety ";
                break;
        }
        switch (tram){
            case 1:
                tram1="one hundred ";
                break;
            case 2:
                tram1="two hundred ";
                break;
            case 3:
                tram1="three hundred ";
                break;
            case 4:
                tram1="four hundred ";
                break;
            case 5:
                tram1="five hundred ";
                break;
            case 6:
                tram1="six hundred ";
                break;
            case 7:
                tram1="seven hundred ";
                break;
            case 8:
                tram1="eight hundred ";
                break;
            case 9:
                tram1="nine hundred ";
                break;
        }
        if (num>20 && num<100){
            str= chuc1+donvi1;
            System.out.print(str);
        }else if (num>100){
            str= tram1 +"and "+chuc1+donvi1;
            System.out.print(str);
        }else if (num==100){
            str= tram1;
            System.out.print(str);
        }

    }
}
