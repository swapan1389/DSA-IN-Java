public class Search_K_Of_LinkedList {

    public static boolean SearchElement(Node head,int K){
        if(head == null) return false;
        Node temp = head;
        while(temp != null){
            if(temp.data == K){
                return true;
            }
            else{
                temp = temp.next;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        System.out.println(SearchElement(head, 5));
    }
    
}
