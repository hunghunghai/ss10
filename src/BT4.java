import java.util.ArrayList;
import java.util.List;

public class BT4 {
    public static void main(String[] args) {
        String inputString = "Rekkei Academy để nông dân biết code";
        List<String> stringList = new ArrayList<>();

        // Chuyển đổi chuỗi đầu vào thành một danh sách các chuỗi
        String[] words = inputString.split(" ");
        for (String word : words) {
            stringList.add(word);
        }

        // In ra các chuỗi có độ dài lớn hơn 3 ký tự
        System.out.println("Các chuỗi có độ dài lớn hơn 3 ký tự:");
        for (String str : stringList) {
            if (str.length() > 3) {
                System.out.println(str);
            }
        }
    }
}
