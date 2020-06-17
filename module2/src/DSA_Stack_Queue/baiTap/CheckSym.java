package DSA_Stack_Queue.baiTap;

import java.util.Scanner;
import java.util.Stack;

public class CheckSym {
    public static void main(String[] args) {
        Stack bStack=new Stack();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập biểu thức: ");
        String str=scanner.nextLine();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='('|| str.charAt(i)==')'){
                bStack.push(str.charAt(i));
            }
        }
//        System.out.println(bStack);

        int count=0;
        char a;
        while (!bStack.isEmpty()){
            a= (char) bStack.pop();
            if (a=='('){
                count--;
            }else if (a==')'){
                count++;
            }
        }

        if (count==0){
            System.out.println("Biểu thức đúng");
        }else {
            System.out.println("Biểu thức sai");
        }
    }
}
