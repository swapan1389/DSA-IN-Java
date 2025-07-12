import java.util.*;
public class Tarjans_ALgorithm_Articulation_Poin {
    static class Edge{
        int src;
        int dest;
        public Edge(int src,int dest){
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

        graph[4].add(new Edge(4,3));
    }

    public static void AP(ArrayList<Edge> graph[],int V){
        int [] dt=new int[V];
        int [] low=new int[V];
        boolean vis[]=new boolean[V];
        int time=0;
        boolean[] ap=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                APUtil(graph,dt,low,vis,ap,i,-1,time);
            }
        }

        for(int i=0;i<V;i++){
            if(ap[i]){
                System.out.println("Articulation point of this graph is:  "+i+" ");
            }
        }

    }

    public static void APUtil(ArrayList<Edge>[] graph,int[] dt,int [] low,boolean [] vis,boolean[] ap,int curr,int parent,int time){
        vis[curr]=true;
        dt[curr]=low[curr]=time++;
        int child=0;
        for(Edge e:graph[curr]){
            int neigh=e.dest;
            if(parent==neigh){
                continue;
            }

            else if(vis[neigh]){
                low[curr]=Math.min(low[curr],dt[neigh]);
            }

            else if(!vis[neigh]){
                APUtil(graph, dt, low, vis, ap, neigh, curr, time);
                low[curr]=Math.min(low[curr],low[neigh]);
                if(dt[curr]<=low[neigh] & parent!=-1){
                    ap[curr]=true;
                }
                child++;
            }
        }

        if(parent==-1 && child>1){
            ap[curr]=true;
        }
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph,V);
        AP(graph, V);


    }
    
}
