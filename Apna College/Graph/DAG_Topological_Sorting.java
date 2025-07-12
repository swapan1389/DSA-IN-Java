import java.util.ArrayList;
import java.util.Stack;

public class DAG_Topological_Sorting {
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

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));


    }
    
    
    public static void topologicalSort(ArrayList<Edge> graph[],int curr,boolean [] vis,Stack<Integer> st){
        vis[curr]=true;
        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                topologicalSort(graph, e.dest, vis,st);
            }
        }

        st.push(curr);
    }

    public static void main(String[] args) {

        // Create a graph
        int V=6;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        boolean vis[] =new boolean[V];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<V;i++){
            if(!vis[i]){
                topologicalSort(graph,i,vis,st);
            }
        }

        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
    
    
}
