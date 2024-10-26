public class CircularQueue_Array {
    static int arr[];
    static int front = -1;
    static int rear=-1;
    static int size;
    CircularQueue_Array(int n){
        arr=new int[n];
        size=n;

    }

    // Overflow
    static boolean isFull() {
        return (rear + 1) % size == front;
    }

    // Underflow
    static boolean isEmpty() {
        return front==-1 && rear==-1;
    }

    // EnQueue
    void add(int data){
        if (isFull()) {
            System.out.println("Circular Queue is full\n");
            return;
        }
        if(front==-1 && rear==-1){
            front=rear=0;
            arr[rear]=data;
        }
        else{
            rear=(rear+1)%size;
            arr[rear]=data;
        }
    }

    // DeQueue
    int remove(){
        if (isEmpty()) {
            System.out.println("Circular Queue is Empty\n");
            return -1;
        }
        int DeQueuedElement=arr[front];
        if(front==rear){
            front=rear=-1;
        }
        else{
            front=(front+1)%size;
        }
        return DeQueuedElement;

    }

    // Peek
    int peek(){
        if (isEmpty()) {
            System.out.println("Circular Queue is Empty\n");
            return -1;
        }
        return arr[front];
    }
    public static void main(String[] args) {
        CircularQueue_Array Queue=new CircularQueue_Array(5);
        Queue.add(14);
        Queue.add(22);
        Queue.add(13);
        Queue.add(9);
        Queue.add(30);
        //Queue.add(40);
        while (!CircularQueue_Array.isEmpty()) {
            System.out.println(Queue.peek());
            Queue.remove();
            
        }
        System.out.println();
        Queue.add(14);
        Queue.add(22);
        Queue.add(13);
        Queue.add(9);
        Queue.add(30);
        Queue.remove();
        Queue.add(40);
        while (!CircularQueue_Array.isEmpty()) {
            System.out.println(Queue.peek());
            Queue.remove();
            
        }


        
    }
    
}
