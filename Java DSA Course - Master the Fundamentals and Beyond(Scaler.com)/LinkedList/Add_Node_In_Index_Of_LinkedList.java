public class Add_Node_In_Index_Of_LinkedList {

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

    public static Node addAtIndex(Node head,int value,int index){
        Node newNode = new Node(value);
        if(index==0){
            newNode.next=head;
            head=newNode;
            return head;
        }
        Node prevNode=head;
        int i=0;
        while(i<index-1){
            prevNode=prevNode.next;
            i++;
        }
        newNode.next=prevNode.next;
        prevNode.next=newNode;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        PrintLinkedList(head);
        Node newHead=addAtIndex(head,8,4);
        PrintLinkedList(newHead);
        
    }
}