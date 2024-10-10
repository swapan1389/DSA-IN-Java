public class First_Occured_Index_Of_A_Number {
    public static int firstOccuredIndex(int [] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return firstOccuredIndex(arr, target, index+1);
    }
    public static void main(String[] args) {
        int [] arr={2,3,6,9,8,3,2,6,2,4,5,4};
        int target1=13;
        int target2=2;
        int result1=firstOccuredIndex(arr,target1,0);
        int result2=firstOccuredIndex(arr,target2,0);
        System.out.println(result1);
        System.out.println(result2);
    }
    
}
