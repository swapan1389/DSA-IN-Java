
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_Operations {

    public static void main(String[] args) {
        // Create a HashMap

        // Country(Key) and Population(Value)
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 138);
        map.put("China", 1439);
        map.put("USA", 331);
        map.put("Japan", 128);

        System.out.println(map);

        map.put("China",1440);

        System.out.println(map);


        // Search

        if(map.containsKey("China")){
            System.out.println("China is present in the map");
        }
        else{
            System.out.println("China is not present in the map");
        }


        //get the values
        System.out.println(map.get("India")); // Output: 138
        System.out.println(map.get("Indonesia")); // Output: null


        // Iterate over map using for each loop
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.print(e.getKey()+" "+e.getValue());
            System.out.println();
            
        }

        System.out.println();
        // Another way storing keys in a set and iterate over it
        Set<String> set=map.keySet();
        for(String s:set){
            System.out.print(s+":"+map.get(s));
            System.out.println();
        }


        // Removing element
        map.remove("Japan");
        System.out.println(map);
        

    }
}
