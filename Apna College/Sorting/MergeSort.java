public class MergeSort {
    public static void Divide(int [] arr,int si,int ei){
        if(si==ei){
            return;
        }
        int mid=si+(ei-si)/2;
        Divide(arr, si, mid);
        Divide(arr, mid+1, ei);
        Conquer(arr,si,mid,ei);
    }

    public static void Conquer(int [] arr,int si,int mid,int ei){
        int[] Merged=new int[ei-si+1];
        int index1=si;
        int index2=mid+1;
        int index=0;
        while(index1<=mid && index2<=ei){
            if(arr[index1]<=arr[index2]){
                Merged[index++]=arr[index1++];
                
            }
            else{
                Merged[index++]=arr[index2++];
            }
        }

        // if Left Array values remains
        while(index1<=mid){
            Merged[index++]=arr[index1++];
        }
         // If Right Array values remains
        while(index2<=ei){
            Merged[index++]=arr[index2++];
        }

        for(int i=0,j=si;i<Merged.length;i++,j++){
            arr[j]=Merged[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        Divide(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}