import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Disconnected_Undirected_Unweighted_BFS_Implementation {

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

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }


     public static void BFS(ArrayList<Edge> graph[],boolean  vis[],int start){
        Queue<Integer> q=new LinkedList<>();
        q.add(start);

        while(!q.isEmpty()){
            int curr=q.poll();
            if(vis[curr]==false){
                System.out.print(curr+" ");
                vis[curr]=true;

                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }

            }


        }


    }


    public static void main(String[] args) {

        // Create a graph
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        boolean vis [] =new boolean[V];

        for(int i=0;i<V;i++){
            if(vis[i]==false){
                BFS(graph,vis,i);
            }
        }
        System.out.println();


    }
    
}
