import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements in List
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list); //["Apple","Banana","Cherry"]

        // Access elements from list
        String element=list.get(1);
        System.out.println(element);    // Banana

        // Setting elements at specified index
        list.set(1,"Grapes");
        System.out.println(list);   //["Apple","Grapes","Cherry"]
        
        // Checking the existence of an element
        System.out.println(list.contains("Cherry"));   // true

        // Removing The element from the list
        list.remove("Grapes");
        System.out.println(list);   // ["Apple","Cheery"]

        // Find the index of an element
        int index=list.indexOf("Cherry");
        System.out.println(index);   // 1


        // Add elements at a specified index
        list.add(1,"Mango");
        System.out.println(list);   // ["Apple","Mango","Cherry"]

        // Calculate the size of the list
        System.out.println(list.size());   // 3

        // Loops 
        for (String str : list) {
            System.out.println(str);
        }

        // Sorting
        Collections.sort(list);
        System.out.println(list);   // ["Apple","Cherry","Mango"]
    }
}