public class Delete_First_Node_Of_LinkedList {
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
    public static Node deleteFirstNode(Node head){
        head=head.next;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        PrintLinkedList(head);
        Node newHead=deleteFirstNode(head);
        PrintLinkedList(newHead);
        
    }
    
}
