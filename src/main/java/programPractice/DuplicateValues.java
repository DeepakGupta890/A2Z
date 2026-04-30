package programPractice;
import java.util.*;

public class DuplicateValues {
    public static void main(String[] args) {

        Map<String, Integer> data = new HashMap<>();
        data.put("A", 100);
        data.put("B", 200);
        data.put("C", 100);
        data.put("D", 300);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int value : data.values()) {
            if (!seen.add(value)) {
                duplicates.add(value);
            }
        }
        
        
        // Step 2: Get keys for duplicate values (only once)
        Set<String> duplicateKeys = new HashSet<>();

        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            if (duplicates.contains(entry.getValue())) {
                duplicateKeys.add(entry.getKey());
            }
        }

        System.out.println("Duplicate values: " + duplicates);
        System.out.println("Duplicate keys: " + duplicateKeys);

      System.out.println("Duplicate values: " + duplicates);
      
    }}
        
        