
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Operations {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<Integer> set = new HashSet<>();

        // Insertion of data
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);


        // Searching
        System.out.println("Is 10 present in the set? " + set.contains(10));
        System.out.println("Is 40 present in the set? " + set.contains(40));


        //Delete
        set.remove(10);
        if(!set.contains(10)){
            System.out.println("10 is removed from the set");
        }


        // Size
        System.out.println("Size of the set: " + set.size());

        // Iterate over the set using iterator
        Iterator <Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

    }
}