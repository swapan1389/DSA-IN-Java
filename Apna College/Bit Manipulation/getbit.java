import java.util.Scanner;

public class getbit {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int n=sc.nextInt();
            int pos=2;
            int bitmask=1<<2;
            if((bitmask & n)==0){
                System.out.println("Bit at position "+pos+" is 0");
            }
            else{
                System.out.println("Bit at position "+pos+" is 1");
            }
        }
    }
}