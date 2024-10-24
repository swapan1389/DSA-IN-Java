import java.util.ArrayList;

public class StackClass_ArrayList {
    static ArrayList<Integer> list = new ArrayList<>();
    public static boolean isEmpty(){
        return list.size()==0;
    }

    public void push(int data){
        list.add(data);
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int popped=list.get(list.size()-1);
        list.remove(list.size()-1);
        return popped;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }

    public static void main(String[] args) {
        StackClass_ArrayList stack = new StackClass_ArrayList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!isEmpty()) {
            System.out.println(stack.pop());
            
        }
        
    }
    
}
