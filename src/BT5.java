import java.util.ArrayList;
import java.util.List;

public class BT5 {
    public static void main(String[] args) {
        String inputString = "Viết chương trình để tìm chữ ngắn nhất trong câu này";
        List<String> wordList = new ArrayList<>();

        // Chuyển đổi chuỗi đầu vào thành một danh sách các từ
        String[] words = inputString.split(" ");
        for (String word : words) {
            wordList.add(word);
        }

        // Tìm chữ ngắn nhất trong danh sách các từ
        List<String> shortestWords = new ArrayList<>();
        int shortestLength = Integer.MAX_VALUE;

        for (String word : wordList) {
            int wordLength = word.length();
            if (wordLength < shortestLength) {
                shortestLength = wordLength;
                shortestWords.clear();
                shortestWords.add(word);
            } else if (wordLength == shortestLength) {
                shortestWords.add(word);
            }
        }

        // In ra chữ ngắn nhất
        System.out.println("Chữ ngắn nhất trong câu: " + shortestWords);
    }
}
