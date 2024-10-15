public class Find_Length_Of_LinkedList {
    public static int findLength(Node head){
        if(head==null){
            return 0;
        }
        int count = 0;
        Node currentNode=head;
        while(currentNode!=null){
            currentNode=currentNode.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        int length=findLength(head);
        System.out.println("Length of the LinkedList is  :"+  length);
        
    }
    
}
