public class Problem3 {
    public static void GreaterBetweenTwoNumbers(int n1,int n2){
        if(n1>n2){
            System.out.println("The greater number between"+" "+n1+"  and"+" "+ n2+" is "+" "+n1);
        }
        else{
            System.out.println("The greater number between"+" "+n1+"  and"+" "+ n2+" is "+" "+n2);
        }
    }
    public static void main(String[] args) {
        GreaterBetweenTwoNumbers(10,20);
        
    }
    
}
