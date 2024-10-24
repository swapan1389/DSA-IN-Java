public class StackClass_LL {

    static Node top;
    class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next=null;
        }
    }

    static boolean isEmpty(){
        return top == null;
    }
    void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            top = newNode;
        }
        else{
            newNode.next = top;
            top = newNode;
        }
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        else{
            int popped = top.data;
            top = top.next;
            return popped;
        }
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return top.data;
    }

    public static void main(String[] args) {
        StackClass_LL stack = new StackClass_LL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while(!isEmpty()){
            System.out.println(stack.pop());
        }
    }
}