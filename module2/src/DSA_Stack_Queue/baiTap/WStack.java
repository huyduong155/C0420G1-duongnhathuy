package DSA_Stack_Queue.baiTap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class WStack {
    private int num;
    private String arr[];

    public WStack(int num) {
        this.num = num;
        arr = new String[num];

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        WStack wStack = new WStack(size);
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử của mảng: ");
            String index = scanner.nextLine();
            wStack.arr[i] = index;
        }
        System.out.println("Array = " + Arrays.toString(wStack.arr));
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < wStack.arr.length; i++) {
            stack.push(wStack.arr[i]);
        }
        System.out.println("Stack = " + stack);
        for (int i = 0; i < wStack.arr.length; i++) {
            wStack.arr[i] = stack.pop();
        }
        System.out.println("Mảng mới sau khi bị đảo:");
        System.out.println("New array = " + Arrays.toString(wStack.arr));

    }
}
