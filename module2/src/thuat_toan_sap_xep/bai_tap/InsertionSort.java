package thuat_toan_sap_xep.bai_tap;

public class InsertionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int k;
            int curentElement=list[i];
            for (k = i - 1; k >= 0 && list[k] > curentElement; k--) {

                list[k + 1] = list[k];
            }
            list[k + 1] = curentElement;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println("");
        System.out.println("List after sort: ");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + " ");
        }
    }
}
