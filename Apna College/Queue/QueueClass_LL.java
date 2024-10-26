public class QueueClass_LL {
    static Node head=null;
    static Node tail=null;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // Underflow
    static boolean isEmpty(){
        return head==null && tail==null;
    }

    // EnQueue
    void add(int data){
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail=tail.next;
        }
    }

    // DeQueue
    int remove(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int DeQueuedElement=head.data;
        if (head == tail) {
            head=tail=null;
        }
        else{
            head=head.next;
        }
        return DeQueuedElement;
    }

    int peek(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }
    public static void main(String[] args) {
        QueueClass_LL Queue=new QueueClass_LL();
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        while (!QueueClass_LL.isEmpty()) {
            System.out.println(Queue.remove());
        }
    }
    
}
