
import java.util.PriorityQueue;

public class Largest_K_Elements_from_Array {
    public static void main(String[] args) {
        int arr[]={18,20,2,5,37,20};
        int k=3;
        largestKElements(arr, k);

    }

    public static void largestKElements(int[] arr, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int i=0;
        while(i<k){
            pq.add(arr[i]);
            i++;
        }
        for(int j=k;j<arr.length;j++){
            if(arr[j]>pq.peek()){
                pq.poll();
                pq.add(arr[j]);
            }
            else{
                // do nothing
            }
        }

        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
    }
    
}
