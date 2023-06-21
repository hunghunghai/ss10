import java.util.ArrayList;
import java.util.List;

public class BT7 {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();

        // Thêm các số nguyên vào danh sách
        numberList.add(5);
        numberList.add(2);
        numberList.add(8);
        numberList.add(1);
        numberList.add(3);

        // In danh sách gốc
        System.out.println("Danh sách gốc: " + numberList);

        // Sắp xếp danh sách theo thứ tự tăng dần
        bubbleSort(numberList);

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
}
