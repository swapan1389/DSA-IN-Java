// print x^n (where stack height=n)


public class PowerOf {
    public static void main(String[] args) {
        int x=2;
        int n=5;
        int result=power(x,n);
        System.out.println("The result is "+result);
    }
    public static int power(int x,int n){
        if(n==0){  /// base case 1  ///  x^0=1
            return 1;
        }
        if(x==0){   /// base case 2 ///  0^n=0
            return 0;
        }
        return x*power(x, n-1);
    }
    
}
