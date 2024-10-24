import java.util.Stack;

public class StackClass_Collection_Framework {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println("Top element is  :"+s.peek());
        System.out.println("Popped element is :"+s.pop());
        while (!s.isEmpty()) {
            System.out.println(s.pop());  
        }
    }
    
}
