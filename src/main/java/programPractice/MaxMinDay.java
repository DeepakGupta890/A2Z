package programPractice;

import java.util.HashMap;
import java.util.Map;

public class MaxMinDay {
    public static void main(String[] args) {

        Map<String, Integer> data = new HashMap<>();
        data.put("Mon", 130);
        data.put("Tues", 140);
        data.put("Wed", 115);
        data.put("Thurs", 176);
        data.put("Fri", 142);
        data.put("Sat", 113); 
        data.put("Sun", -105);

        String maxDay = "";
        String minDay = "";
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxDay = entry.getKey();
            }
            if (entry.getValue() < min) {
                min = entry.getValue();
                minDay = entry.getKey();
            }
        }

        System.out.println("Max Amount: " + max + " on " + maxDay);
        System.out.println("Min Amount: " + min + " on " + minDay);
    }


}
