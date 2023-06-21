import java.util.ArrayList;
import java.util.List;

public class BT2 {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();

        // Thêm các số nguyên vào danh sách
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);

        // In danh sách gốc
        System.out.println("Danh sách gốc: " + originalList);

        // Tạo danh sách mới để lưu trữ kết quả đảo ngược
        List<Integer> reversedList = new ArrayList<>();

        // Duyệt danh sách gốc từ cuối về đầu và thêm từng phần tử vào danh sách mới
        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }

        // In danh sách sau khi đảo ngược
        System.out.println("Danh sách đảo ngược: " + reversedList);
    }
}
