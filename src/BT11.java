import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BT11 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(10, 123, 123, 1, 123);


        System.out.println("Danh sách: " + numberList);

        // Tìm phần tử nhỏ nhất trong danh sách
        Integer minElement = Collections.min(numberList);
        System.out.println("Phần tử nhỏ nhất trong danh sách: " + minElement);
        // Tìm phần tử lớn nhất trong danh sách
        Integer maxElement = Collections.max(numberList);
        System.out.println("Phần tử lớn nhất trong danh sách: " + minElement);
    }
}
