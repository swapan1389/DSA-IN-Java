
import java.util.Collections;
import java.util.PriorityQueue;

class heapExample{
    public static void main(String[] args) {

        //Heap and prority queue are same 
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        // Adding elements to heap ...........> O(logn)
        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(35);
        pq.add(30);
        pq.add(10);

        // Operations:Peek....>O(1) and remove.......>O(logn)
        System.out.println(pq);
        System.out.println(pq.peek());

        // The least will be removed first as least element has the highest priority by default 
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);


        // Size............>O(1)
        System.out.println(pq.size());



        // For this heap highest element will get the highest priority and removed first
        PriorityQueue<Integer> pq1=new PriorityQueue<>(Collections.reverseOrder());
        pq1.add(40);
        pq1.add(50);
        pq1.add(45);

        System.out.println(pq1);
        System.out.println(pq1.remove());
    }
}