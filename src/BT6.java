import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BT6 {
    public static void main(String[] args) {
        // mảng số nguyên
        List<Integer> numberList = Arrays.asList(1, 5, 7, 4, 9, 2, 5, 67);
        // In danh sách gốc
        System.out.println("Danh sách gốc: " + numberList);
        // Sắp xếp danh sách theo thứ tự tăng dần
        //nổi bọt
        bubbleSort(numberList);
        // In danh sách sau khi sắp xếp
        System.out.println("Danh sách sau khi sắp xếp tăng dần: " + numberList);
        //chọn
        selectionSort(numberList);
        // In danh sách sau khi sắp xếp
        System.out.println("Danh sách sau khi sắp xếp tăng dần: " + numberList);
        //chèn
        insertionSort(numberList);
        // In danh sách sau khi sắp xếp
        System.out.println("Danh sách sau khi sắp xếp tăng dần: " + numberList);
    }

    // Thuật toán nổi bọt để sắp xếp danh sách
    public static void bubbleSort(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Hoán đổi hai phần tử
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void selectionSort(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }

    public static void insertionSort(List<Integer> list) {
        int n = list.size();
        for (int i = 1; i < n; i++) {
            int key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }
}
