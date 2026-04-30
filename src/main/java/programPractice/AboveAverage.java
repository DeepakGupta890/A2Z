package programPractice;

import java.util.*;

public class AboveAverage {
    public static void main(String[] args) {
  
        Map<String, Integer> data = new HashMap<>();
        data.put("Mon", 100);
        data.put("Tue", 200);
        data.put("Wed", 300);

        int sum = 0;

        for (int value : data.values()) {
            sum += value;
        }

        double avg = sum / data.size();

        System.out.println("Average: " + avg);

        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            if (entry.getValue() > avg) {
                System.out.println(entry.getKey() + " is above average");
            }
        }
    }
}