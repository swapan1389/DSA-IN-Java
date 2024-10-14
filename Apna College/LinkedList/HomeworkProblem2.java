import java.util.*;

public class HomeworkProblem2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of node you want to add in LinkedList :");
            int node_number=scanner.nextInt();
            LinkedList<Integer> linkedList = new LinkedList<>();
            for (int i = 0; i < node_number; i++) {
                System.out.println("Enter the node value :");
                int n=scanner.nextInt();
                if(n>=1 && n<=50){
                    linkedList.add(n);
                }
                else{
                    System.out.println(n+" is an Invalid input");
                    break;
                }
            }
            System.out.println(linkedList);
            // Delete the nodes which have values greater than 25
            Iterator<Integer> iterator = linkedList.iterator();
            while(iterator.hasNext()){
                int n=iterator.next();
                if(n>25){
                    iterator.remove();
                }
            }
            System.out.println(linkedList);
        }
    }
    
}
