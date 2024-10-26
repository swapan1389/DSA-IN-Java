import java.util.ArrayList;

public class QueueClass_ArrayList {

    static ArrayList<Integer> arr=new ArrayList<>();
    static int front=-1;
    static int rear=-1;

    static boolean isEmpty(){
        return front==-1 && rear==-1;
    }

    // EnQueue
    void add(int data){
        if(front==-1 && rear==-1){
            front=rear=0;
            arr.add(data);
        }
        else{
            rear++;
            arr.add(data);
        }
    }

    // DeQueue
    int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int DeQueuedElement=arr.get(front);

        if(front==rear){
            arr.remove(front);
            front=rear=-1;
        }

        else{
            arr.remove(front);
            rear--;
        }
        return DeQueuedElement;
    }

    // Peek
    int Peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr.get(front);
    }
    public static void main(String[] args) {
        QueueClass_ArrayList queue=new QueueClass_ArrayList();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        while(!QueueClass_ArrayList.isEmpty()){
            System.out.println(queue.remove());
        }
        
    }
    
}
