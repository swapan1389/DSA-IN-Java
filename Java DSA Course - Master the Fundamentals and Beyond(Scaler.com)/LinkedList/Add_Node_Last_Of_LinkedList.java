public class Add_Node_Last_Of_LinkedList {
    public static void PrintLinkedList(Node head){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.data+"-->");
            currentNode=currentNode.next;
        }
        System.out.println("Null");

    }
    public static Node addLast(Node head,int data){
        Node newNode=new Node(data);
        if(head==null){
            return newNode;
        }
        Node tailNode=head;
        while(tailNode.next!=null){
            tailNode=tailNode.next;
        }
        tailNode.next=newNode;
        return head;

    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        System.out.println("Original LinkedList is :");
        PrintLinkedList(head);
        addLast(head,90);
        System.out.println("LinkedList after Insertion node at Last Of LinkedList:");
        PrintLinkedList(head);
    }
    
}
