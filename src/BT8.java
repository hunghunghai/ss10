import java.util.ArrayList;
import java.util.List;

public class BT8 {
    public static void main(String[] args) {
        List<Integer> sourceList = new ArrayList<>();
        sourceList.add(1);
        sourceList.add(2);
        sourceList.add(3);

        List<Integer> targetList = new ArrayList<>();
        targetList.addAll(sourceList);

        System.out.println("Danh sách nguồn: " + sourceList);
        System.out.println("Danh sách đích: " + targetList);
    }
}
