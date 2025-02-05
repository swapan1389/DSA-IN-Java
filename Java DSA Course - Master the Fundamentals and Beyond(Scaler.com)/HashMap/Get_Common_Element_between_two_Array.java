
import java.util.HashMap;

public class Get_Common_Element_between_two_Array {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }

        for(int i=0;i<arr2.length;i++){
            if(map.containsKey(arr2[i])){
                System.out.println(arr2[i]);
            }
        }
    }
    
}
