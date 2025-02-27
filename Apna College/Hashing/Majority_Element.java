
import java.util.HashMap;
import java.util.Map;

// Given an integer array of size n ,find all the elements int the array that appears greater than n/3 times
// Example-[1,3,2,5,1,3,1,5,1] ,n=9 output=1
// [1,2],n=2 output=1,2

public class Majority_Element {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int n = arr.length;
        FindElement(arr,n);
    }
    public static void FindElement(int[] arr,int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        int count = n/3;

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>count){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}