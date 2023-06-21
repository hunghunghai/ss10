import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BT3 {
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

        // Sắp xếp danh sách theo thứ tự giảm dần
        Collections.sort(numberList, Comparator.reverseOrder());

        // In danh sách sau khi sắp xếp
        System.out.println("Danh sách sau khi sắp xếp giảm dần: " + numberList);
    }
}
