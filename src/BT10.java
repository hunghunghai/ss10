import java.util.ArrayList;
import java.util.List;

public class BT10 {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);

        System.out.println("Danh sách: " + numberList);

        // Tính tổng các phần tử trong danh sách
        int sum = 0;
        for (Integer element : numberList) {
            sum += element;
        }

        System.out.println("Tổng các phần tử trong danh sách: " + sum);
    }
}
