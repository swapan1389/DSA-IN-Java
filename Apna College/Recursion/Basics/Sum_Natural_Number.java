public class Sum_Natural_Number {
    public static void main(String[] args) {
        NaturalSum(1,5,0);
    }
    public static void NaturalSum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        NaturalSum(i+1, n, sum);
    }
    
}
