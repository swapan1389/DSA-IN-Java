public class Place_Tiles_In_Floor {
    public static int CalculateWays(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        // Horizontal Placements 
        int HorizontalPlace=CalculateWays(n-1, m);
        // Vertical Placements
        int VerticalPlace=CalculateWays(n-m, m);
        return HorizontalPlace+VerticalPlace;
    }
    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println(CalculateWays(n, m));
        
    }
    
}
