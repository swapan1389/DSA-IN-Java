import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Reverse_K_Of_Queue
 */
public class Reverse_K_Of_Queue {
    static void reverse_k_element(Queue<Integer> q,int k){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<k;i++){
            st.push(q.remove());
        }

        while (!st.isEmpty()) {
            q.add(st.pop());
            
        }

        int remaining=q.size()-k;
        for(int i=0;i<remaining;i++){
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
       // Print original queue
    System.out.print("Original Queue: ");
    for (Integer num : q) {
        System.out.print(num + " ");
    }
    System.out.println();

    // Reverse the first k elements
    reverse_k_element(q, 3);

    // Print the modified queue
    System.out.print("Modified Queue: ");
    while (!q.isEmpty()) {
        System.out.print(q.remove() + " ");
    }
    }
}