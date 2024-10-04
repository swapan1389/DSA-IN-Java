public class InsertionSortExample {
    public static void main(String[] args) {
        int arr[]={2,8,4,-1,7,10,5,6};
        insertionSort(arr);
        printArray(arr);
    }
    public static void insertionSort(int [] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=current;
        }

    }
    public static void printArray(int arr[]){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
