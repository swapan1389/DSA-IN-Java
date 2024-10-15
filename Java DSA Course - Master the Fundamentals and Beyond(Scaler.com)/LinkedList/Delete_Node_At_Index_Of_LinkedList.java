public class Delete_Node_At_Index_Of_LinkedList {
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

    public static Node deleteNodeAtIndex(Node head,int index){
        if(head==null){
            return null;
        }
        Node prevNode=head;
        if(index==0){
            head=head.next;
            return head;
        }
        int i=0;
        while(i<index-1){
            prevNode=prevNode.next;
            i++;
        }
        prevNode.next=prevNode.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        PrintLinkedList(head);
        Node newHead=deleteNodeAtIndex(head,0);
        PrintLinkedList(newHead);
        
    }
    
}
