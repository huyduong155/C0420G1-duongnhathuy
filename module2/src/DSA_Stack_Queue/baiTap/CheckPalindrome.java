package DSA_Stack_Queue.baiTap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi: ");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        Queue<Character> queue = new LinkedList<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            queue.add(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == queue.remove()) {
                System.out.println("Đây là chuỗi Palindrome ");
                break;
            }
            System.out.println("Đây không phải là chuỗi Palindrome ");
            break;
        }
    }
}
