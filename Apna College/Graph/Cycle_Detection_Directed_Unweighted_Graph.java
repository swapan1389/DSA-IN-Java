import java.util.ArrayList;

public class Cycle_Detection_Directed_Unweighted_Graph {
    
    static class Edge{
        int src;
        int dest;
        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }


    public static void createGraph(ArrayList<Edge> graph[]){

        // Initialize the Array Buckets
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
    }
    
    
    public static boolean  isCycleDirected(ArrayList<Edge> graph[],int curr,boolean [] vis,boolean [] rec){
        vis[curr] = true;
        rec[curr] = true;
        for(Edge edge: graph[curr]){
            if(rec[edge.dest]){
                return true;
            }

            else if(vis[edge.dest]==false){
                if(isCycleDirected(graph, edge.dest, vis, rec)){
                    return true;
                }
            }
        }

        rec[curr]=false;
        return false;
        
    }

    public static void main(String[] args) {

        // Create a graph
        int V=4;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        boolean vis[] = new boolean[V];
        boolean rec[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                boolean iscycle=isCycleDirected(graph, i, vis, rec);
                if(iscycle==true){
                    System.out.println("Graph contains cycle");
                    break;
                }
            }
        }
        
    }
    
}