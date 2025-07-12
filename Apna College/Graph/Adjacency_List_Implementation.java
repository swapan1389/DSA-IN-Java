
import java.util.*;

public class Adjacency_List_Implementation {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src, int dest,int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){

        // Initialize the Array Buckets
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        
        // Unweighted Graph
        // graph[0].add(new Edge(0, 2));

        // graph[1].add(new Edge(1, 2));
        // graph[1].add(new Edge(1, 3));

        // graph[2].add(new Edge(2, 0));
        // graph[2].add(new Edge(2, 1));
        // graph[2].add(new Edge(2, 3));

        // graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 2));


        // Weighted Graph

        graph[0].add(new Edge(0, 2,2));

        graph[1].add(new Edge(1, 2,10));
        graph[1].add(new Edge(1, 3,0));

        graph[2].add(new Edge(2, 0,2));
        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 3,-1));

        graph[3].add(new Edge(3, 1,0));
        graph[3].add(new Edge(3, 2,-1));
        



    


    }
    
    
    public static void main(String[] args) {
        // Create a graph
        int V=4;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);

        // Printing the neighbours of vertex 2
        System.out.println("Neighbours of vertex 2 are: ");
        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.println(e.dest+" "+e.wt);
        }
        

    }
}