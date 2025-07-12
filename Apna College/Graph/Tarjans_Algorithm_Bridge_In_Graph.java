
import java.util.*;

public class Tarjans_Algorithm_Bridge_In_Graph {
    static class Edge{
        int src;
        int dest;
        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[],int V){
        for(int i=0;i<V;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
       //  graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,3));
       // graph[4].add(new Edge(4,5));

        //graph[5].add(new Edge(5,3));
       // graph[5].add(new Edge(5,4));
        
    }

    public static void getbridge(ArrayList<Edge> graph[],int V){
        int dt[]=new int[V];  // dt->discovery Time
        int low[]=new int[V];  // low->lowest discovery time of its neighbours
        boolean[] vis =new boolean[V];  
        int time=0;
        for(int i=0;i<V;i++){
            if(!vis[i]) {
                dfs(graph,i,-1,vis,dt,low,time);
            }
        }

    }

    public static void dfs(ArrayList<Edge> graph[],int curr,int parent,boolean[] vis,int[] dt,int [] low,int time){
        vis[curr]=true;
        dt[curr]=low[curr]=time++;
        for(Edge e:graph[curr]){
            if(e.dest==parent) continue;
            else if(!vis[e.dest]){
                dfs(graph,e.dest,curr,vis,dt,low,time);
                low[curr]=Math.min(low[curr],low[e.dest]);
                if(dt[curr]<low[e.dest]){
                    System.out.println("Edge "+curr+"---- "+e.dest+" is a bridge");
                }
            }
            else if(vis[e.dest]){
                low[curr]=Math.min(low[curr],dt[e.dest]);
            }
        }
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph,V);
        getbridge(graph,V);


    }
    
}
