package case_study.jame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string = null;
        List<String> list=new ArrayList<>();
       while (scanner.hasNextLine()){
           string=scanner.nextLine();
           list.add(string);
           if (string.equals(".")){
               break;
           }
       }
       String a="";
        for (int i = 0; i <list.size()-1 ; i++) {
            a+=list.get(i)+"\n";
        }
        System.out.println(a);
    }
}

