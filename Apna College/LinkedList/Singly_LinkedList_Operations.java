public class Singly_LinkedList_Operations {
    int size;
    Node head;
    Singly_LinkedList_Operations(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        public Node(String data){
            this.data=data;
            this.next=null;
            size++;

        }
    }
    private void insertAtHead(String data) {
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;  
    }

    private void insertAtLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currentNode=head;
        while (currentNode.next!=null) {
            currentNode = currentNode.next;
            
        }
        currentNode.next=newNode;
    }

    private void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }

    private void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;   ///  Here we are decrementing because if there is only ne node before decrementing size it will be return that,s why
        if(head.next==null){
            head=null;
            return ;
        }
        Node currentNode=head;
        while(currentNode.next.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=null;
    }
    private int getSize(){
        return size;
    }

    private void printLinkedList(){
        if(head==null){
            System.out.println("List is empty");
            return;

        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data+"--->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Singly_LinkedList_Operations list = new Singly_LinkedList_Operations();
        list.insertAtHead("a");
        list.insertAtHead("is");
        list.printLinkedList();
        list.insertAtLast("List");
        list.printLinkedList();
        list.insertAtHead("This");
        list.printLinkedList();
        list.deleteFirst();
        list.printLinkedList();
        list.deleteLast();
        list.printLinkedList();
        System.out.println("Size of the list: "+list.getSize());
        list.insertAtLast("List");
        System.out.println("New size is: "+list.getSize());

    }
}