import java.util.ArrayList;

public class Connected_Undirected_Unweighted_DFS_Implementation {
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


        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2,4));
        graph[2].add(new Edge(2,0));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(5,5));




    }
    
    
    public static void DFS(ArrayList<Edge> graph[],int curr,boolean [] vis){
        System.out.print(curr+" ");
        vis[curr]=true;
        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                DFS(graph, e.dest, vis);
            }
        }
    }

    public static void main(String[] args) {

        // Create a graph
        int V=7;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        boolean vis[] =new boolean[V];
        DFS(graph,0,vis);
    }
    
}
