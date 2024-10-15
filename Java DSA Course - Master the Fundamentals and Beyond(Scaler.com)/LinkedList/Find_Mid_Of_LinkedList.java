public class Find_Mid_Of_LinkedList {
    public static Node findMidNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(8);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        Node midNode=findMidNode(head);
        System.out.println("Middle Node of the LinkedList is :"+midNode.data);
    }
    
}
