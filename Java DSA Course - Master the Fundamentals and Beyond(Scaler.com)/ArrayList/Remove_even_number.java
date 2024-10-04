import java.util.ArrayList;

public class Remove_even_number {
    public static void main(String[] args) {
        //Ex->list={5,10,4,15,8,21,3}
        // After Removal -> list={5,15,21,3}
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(4);
        list.add(15);
        list.add(8);
        list.add(21);
        list.add(3);
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                list.remove(i);
            }
         }
        System.out.println(list);
    }
    
}
