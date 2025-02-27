
import java.util.HashMap;

public class SubArray_Sum_K {

    public static void main(String[] args) {
        int [] arr={10,2,-2,-20,10};
        int k=-10;
        HashMap<Integer,Integer> map=new HashMap<>(); //<Prefixsum,frequency>
        map.put(0,1); /// Empty subarray
        int prefixsum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            prefixsum+=arr[i];
            if(map.containsKey(prefixsum-k)){
                count+=map.get(prefixsum-k);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        System.out.println(count);
    }
}