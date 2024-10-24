import java.util.Stack;

public class Reverse_Stack {
    public static void pushBottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushBottom(data,s);
        s.push(top);
    }
    public static void Reverse(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        Reverse(s);
        pushBottom(top, s);

    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        Reverse(s);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
            
        }
    }
    
}
