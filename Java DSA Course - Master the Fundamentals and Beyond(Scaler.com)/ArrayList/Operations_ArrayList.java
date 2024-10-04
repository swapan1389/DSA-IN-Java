import java.util.ArrayList;

public class Operations_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        //Add the elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        // Add element at a particular index
        list.add(1, 15);
        System.out.println(list);


        // get elements from the ArrayList
        System.out.println(list.get(0));


        // Set the element of an index
        list.set(0, 5);
        System.out.println(list);

        //remove the element from ArrayList
        list.remove(0);
        System.out.println(list);

        // size
        System.out.println(list.size());


        // indexOf
        System.out.println(list.indexOf(30));
        System.out.println(list.indexOf(90));


        // toString
        System.out.println(list.toString());

    }
}