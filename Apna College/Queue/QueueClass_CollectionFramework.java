import java.util.*;
public class QueueClass_CollectionFramework {
    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();
        // Creating a Queue using ArrayDeQue
        Queue<String> queue1 = new ArrayDeque<>();
        // Adding elements to the Queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        queue.add("Date");
        queue.add("Elderberry");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());    
        }
        System.out.println();
        queue1.add("Orange");
        queue1.add("Grapes");
        queue1.add("Mango");
        while (!queue1.isEmpty()) {
            System.out.println(queue1.remove());
            
        }
    }
    
}
