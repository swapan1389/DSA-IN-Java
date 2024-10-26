import java.util.*;
public class Queue_Using_Two_Stack {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    // Underflow
    boolean isEmpty() {
        return s1.isEmpty();
    }

    // Adding elements 
    void add(int data){
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
            
        }
        s1.push(data);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // Remove elements
    int remove(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.pop();
    }

    // Peek Elements
    int peek(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.peek();
    }
    public static void main(String[] args) {
        Queue_Using_Two_Stack q = new Queue_Using_Two_Stack();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
            
        }

    }

    
}
