package DSA_Stack_Queue.baiTap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class IStack {
    private int num;
    private int arr[];

    public IStack(int num) {
        this.num = num;
        arr = new int[num];

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int size = scanner.nextInt();
        IStack iStack = new IStack(size);
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử của mảng: ");
            int index = scanner.nextInt();
            iStack.arr[i] = index;
        }
        System.out.println("Array = " + Arrays.toString(iStack.arr));
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < iStack.arr.length; i++) {
            stack.push(iStack.arr[i]);
        }
        System.out.println("Stack = " + stack);
        for (int i = 0; i < iStack.arr.length; i++) {
            iStack.arr[i] = stack.pop();
        }
        System.out.println("Mảng mới sau khi bị đảo:");
        System.out.println("New array = " + Arrays.toString(iStack.arr));

    }
}
