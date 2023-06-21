import java.util.ArrayList;
import java.util.List;

public class BT9 {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);
        numberList.add(4);
        numberList.add(1);

        System.out.println("Danh sách gốc: " + numberList);

        // Xóa các phần tử trùng lặp
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer number : numberList) {
            if (!uniqueList.contains(number)) {
                uniqueList.add(number);
            }
        }

        // Gán danh sách mới vào danh sách gốc
        numberList = uniqueList;

        System.out.println("Danh sách sau khi xóa các phần tử trùng lặp: " + numberList);
    }
}
