public class Array_Element_Print_Using_Recursion {
    public static void printArrayElements(int [] arr,int index){
        if(index == arr.length){
            return;
        }
        System.out.print(arr[index] + " ");
        printArrayElements(arr, index+1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArrayElements(arr, 0);
    }
    
}
