public class SelectionSortExample {
    public static void main(String[] args) {
        int arr[]={2,8,4,-1,7,10,5,6};
        SelectionSort(arr);
        printArray(arr);
    }
    public static void SelectionSort(int [] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minindex=i;
            int minvalue=arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j]<minvalue){
                    minindex=j;
                    minvalue=arr[j];
                }
            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }

    }
    public static void printArray(int arr[]){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    
}
