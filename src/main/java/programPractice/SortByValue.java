package programPractice;
import java.util.*;

public class SortByValue {
    public static void main(String[] args) {

        Map<String, Integer> data = new HashMap<>();
        data.put("Mon", 500);
        data.put("Tue", 200);
        data.put("Wed", 800);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(data.entrySet());

        list.sort((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}