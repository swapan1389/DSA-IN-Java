import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        int PositiveNumberCount=0;
        int NegativeNumberCount=0;
        int Zeros=0;
        String choice;
        Scanner sc=new Scanner(System.in);
        do {

            System.out.println("Enter the number: ");
            int number=sc.nextInt();
            if(number>0){
                PositiveNumberCount++;
            }
            else if(number<0){
                NegativeNumberCount++;
            }
            else{
                Zeros++;
            }
            System.out.println("Do you want to continue?(y/n)");
            choice=sc.next();
        } while (choice.equalsIgnoreCase("y"));
        System.out.println("Positive Number Count: "+PositiveNumberCount);
        System.out.println("Negative Number Count:"+NegativeNumberCount);
        System.out.println("Zeros Count:"+Zeros);
        sc.close();
    }
    
}
