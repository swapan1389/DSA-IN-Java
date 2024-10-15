class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next=null;
    }
}


public class Add_Node_First_Of_LinkedList {
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
    public static Node addFirst(Node head,int data){
        Node currentNode=new Node(data);
        if(head==null){
            return currentNode;
        }
        currentNode.next=head;
        return currentNode;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        PrintLinkedList(head);
        Node newHead=addFirst(head, 8);
        PrintLinkedList(newHead);
        
    }
}