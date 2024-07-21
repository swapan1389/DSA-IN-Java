import java.util.Scanner;

public class ArrayExample3 {
    public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array:");
            int size=sc.nextInt();
            int [] arr=new int[size];
            System.out.println("Enter the elements of the array:");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int index=-1;
            System.out.println("Enter the value you want to search:");
            int x=sc.nextInt();
            for(int i=0;i<arr.length;i++){
                if(arr[i]==x){
                   // System.out.println("The element is present at index"+i);
                   index=i;
                   break;
                }
            }
            if(index==-1){
                System.out.println("The element is not present in the array");
            }
            else{
                System.out.println("The element is present at index   "+index);
            }
        }
    }
    
}
