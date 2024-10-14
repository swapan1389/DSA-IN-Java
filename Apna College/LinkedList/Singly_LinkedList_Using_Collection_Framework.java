import java.util.LinkedList;
public class Singly_LinkedList_Using_Collection_Framework {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("A");
        list.addFirst("IS");
        list.addFirst("THIS");
        System.out.println(list);
        list.addLast("LinkedList");
        System.out.println(list);
        System.out.println(list.size());

        // print node using Loop
        System.out.println("Printing Node using Loop");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"-->");
        }
        System.out.println("Null");

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
    
}
