import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number :");
            int n=sc.nextInt();
            System.out.println("Enter the position of bit to be updated :");
            int pos=sc.nextInt();
            System.out.println("Enter the update operation type :");
            String op=sc.next(); // we can not use nextLine in this part as as its previous input is nextInt so if we use NextLine here so prompt will accept empty string without waiting for input from prompt
            switch (op) {
                case "toZero":

                    toZero(n,pos);
                    break;
                case "toOne":
                    toOne(n,pos);
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
        }
    }
    public static void toZero(int n,int pos){
        int Bitmask=1<<pos;
        int updatedBit=n&(~Bitmask);
        System.out.println("Updated New Number is  "+updatedBit);
     }
     public static void toOne(int n,int pos){
        int Bitmask=1<<pos;
        int updatedBit=n|Bitmask;
        System.out.println("Updated New Number is  "+updatedBit);
     }
    
}
