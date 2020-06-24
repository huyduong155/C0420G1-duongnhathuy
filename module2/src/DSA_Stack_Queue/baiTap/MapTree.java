package DSA_Stack_Queue.baiTap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapTree {
    public static int countWord(String[] word, String string) {
        int count = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i].equals(string)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập văn bản:");
        String document = scanner.nextLine();
        document = document.toLowerCase();
        String[] word = document.split(" ");
        int value;
        for (int i = 0; i < word.length; i++) {
            value = countWord(word, word[i]);
            map.put(word[i], value);
        }
        System.out.println(map);


    }


}

