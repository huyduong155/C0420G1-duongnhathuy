package MangVaPhuongThucTrongJava.thucHanh;

public class TimMinTrongMangSuDungPhuongThuc {
    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {4, 12, 5, 2, 10, 6, 1};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + index);
    }
}
