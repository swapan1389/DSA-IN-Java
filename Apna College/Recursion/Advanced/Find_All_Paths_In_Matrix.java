public class Find_All_Paths_In_Matrix {
    public static int count_paths(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(i>=n || j>=m){
            return 0;
        }

        // right direction move
        int right = count_paths(i,j+1,n,m);

        // downwards move
        int down = count_paths(i+1,j,n,m);

        return right+down;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(count_paths(0, 0, n, m));
        
    }
    
}
