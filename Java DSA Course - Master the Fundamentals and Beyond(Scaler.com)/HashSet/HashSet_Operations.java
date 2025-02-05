import java.util.*;

public class HashSet_Operations {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");

        // Print the elements
        System.out.println("HashSet: " + set);

        // Length
        System.out.println("Length: " + set.size());

        // Searching
        System.out.println("Contains Apple: " + set.contains("Apple"));

        // Traversal in HashSet
        System.out.println("HashSet elements: ");
        for (String str : set) {
            System.out.println(str);
        }

        // Using iterator
        System.out.println("HashSet elements using iterator: ");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // Remove elements
        set.remove("Apple");
        System.out.println("HashSet after removing Apple: " + set);



        
    }
}