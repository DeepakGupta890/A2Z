package programPractice;

import java.util.HashMap;
import java.util.Map;

public class SecondMax {
	
	public static void main(String[] args) {

        Map<String, Integer> data = new HashMap<>();
        data.put("Mon", 120);
        data.put("Tue", 450);
        data.put("Wed", 300);
        data.put("Thu", 450);

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int value : data.values()) {
            if (value > max) {
                secondMax = max;
                max = value;
            } else if (value > secondMax && value != max) {
                secondMax = value;
            }
        }

        System.out.println("Second Highest Value: " + secondMax);
    }


}
