import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BT1 {
    public static void main(String[] args) {
        List<Integer> randomList = new ArrayList<>();

        // Lấy số lượng phần tử ngẫu nhiên trong khoảng từ 1 đến 10
        int numElements = (int) (Math.random() * 10) + 1;

        // Gán giá trị ngẫu nhiên cho từng phần tử trong list
        for (int i = 0; i < numElements; i++) {
            int randomValue = (int) (Math.random() * 100); // Giới hạn giá trị trong khoảng từ 0 đến 99
            randomList.add(randomValue);
        }

        // In ra List ngẫu nhiên
        System.out.println("List ngẫu nhiên: " + randomList);

        // Tìm phần tử lớn nhất trong List
        int maxElement = Collections.max(randomList);

        // In phần tử lớn nhất ra
        System.out.println("Phần tử lớn nhất: " + maxElement);
    }
}
