import java.util.HashSet;

public class Intersection2Arrays {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};

        HashSet<Integer> set=new HashSet<>();

        for(int num:arr1){
            set.add(num);
        }

        for(int num1:arr2){
            if(set.contains(num1)){
                System.out.print(num1+" ");
                set.remove(num1);
            }
        }
    }
    
}
