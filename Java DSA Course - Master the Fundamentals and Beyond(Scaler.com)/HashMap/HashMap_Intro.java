
import java.util.HashMap;
import java.util.Map;

public class HashMap_Intro {

    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> population = new HashMap<>();

        // Add the data
        population.put("India", 135);
        population.put("China", 149);
        population.put("USA", 33);
        population.put("Japan", 45);

        // Get the value
        System.out.println(population.get("India")); // Output: 135

        // Search Key 
        System.out.println(population.containsKey("India"));
        System.out.println(population.containsKey("UK"));


        // Traverse over map
        for (Map.Entry<String, Integer> entry : population.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Size of map
        System.out.println(population.size());


        // Remove
        population.remove("India");
        System.out.println(population.size());

        
    }
}