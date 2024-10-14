import java.util.LinkedList;

public class HomeworkProblem1 {

    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        System.out.println(list);
        int target=7;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==target){
                System.out.println("The target found at "+i+"  index");
            }
        }
        
    }
}