
public class BubbleSortExample {
    public static void main(String[] args) {
        int arr[]={2,8,4,-1,7,10,5,6};
        bubbleSort(arr);
        printArray(arr);    
    }
    public static void bubbleSort(int [] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
    }

    
}
}