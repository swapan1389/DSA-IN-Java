public class QueueClass_Array {
        static int arr[];
        static int front=-1;
        static int rear=-1;
        static int size;
        QueueClass_Array(int n){
            arr=new int[n];
            size=n;
        }
        static boolean isFull(){
            return rear==size-1;
        }

        static boolean isEmpty(){
            return front==-1 && rear==-1;
        }

        // EnQueue
        void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front==-1 && rear==-1){
                front=rear=0;
                arr[rear]=data;
            }
            else{
                rear++;
                arr[rear]=data;
            }
        }

        // Dequeue
        int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int Dequeued_Element=arr[front];
            if(front==rear){
                front=rear=-1;
            }
            else{
                // for(int i=0;i<rear;i++){
                //     arr[i]=arr[i+1];
                // }
                // rear--;
                front++;
            }
            return Dequeued_Element;
        }

        // Peek
        int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    public static void main(String[] args) {
        QueueClass_Array q = new QueueClass_Array(8);
        q.add(1);
        q.add(5);
        q.add(2);
        q.add(3);
        while (!QueueClass_Array.isEmpty()) {
            System.out.println(q.remove());    
        }
    }
}