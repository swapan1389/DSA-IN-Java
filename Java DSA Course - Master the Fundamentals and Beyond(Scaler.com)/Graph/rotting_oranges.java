
import java.util.LinkedList;
import java.util.Queue;

public class rotting_oranges {
    public static void main(String[] args) {
        int [][] arr={{0,1,1,0},
                      {2,1,0,0},
                      {1,1,2,0},
                      {1,1,1,1}};

        System.out.println("Time taken for rotten oranges is := "+ rottenhelper(arr)+ " Unit");              
    } 
    
    public static int rottenhelper(int [][] arr) {
        Queue<int[]> q=new LinkedList<>();
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==2){
                    int [] temp={i,j,0};
                    q.add(temp);
                }
            }
        }
        int ans=0;
        while(!q.isEmpty()){
            int [] rem=q.poll();
            int x=rem[0];
            int y=rem[1];
            int time=rem[2];
            ans=Math.max(ans, time);

            if(x+1<arr.length && arr[x+1][y]==1){
                arr[x+1][y]=2;
                int [] temp={x+1,y,time+1};
                q.add(temp);
            }

            if(x-1>=0 && arr[x-1][y]==1){
                arr[x-1][y]=2;
                int [] temp={x-1,y,time+1};
                q.add(temp);
            }

            if(y+1<arr[0].length && arr[x][y+1]==1){
                arr[x][y+1]=2;
                int [] temp={x,y+1,time+1};
                q.add(temp);
            }

            if(y-1>=0 && arr[x][y-1]==1){
                arr[x][y-1]=2;
                int [] temp={x,y-1,time+1};
                q.add(temp);
            }

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==1) return -1;
            }
        }
        return ans;
    }
    
}
