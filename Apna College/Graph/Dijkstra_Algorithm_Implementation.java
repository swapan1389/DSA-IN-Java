
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra_Algorithm_Implementation {
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
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));


    }

    public static class pair implements Comparable<pair>{
        int node;
        int dist;
        public pair(int node,int dist){
            this.node=node;
            this.dist=dist;
        }

        @Override
        public int compareTo(pair o) {
            return this.dist - o.dist; // Ascending
            // return o.dist - this.dist; // Descending
        }
    }
   // O(E+ELogV)
    public static void Dijkstra(ArrayList<Edge> graph[],int src,int V){
        PriorityQueue<pair> pq=new PriorityQueue<>();
        boolean[] visited=new boolean[V];
        int[] dist=new int[V];
        for(int i=0;i<V;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        pq.add(new pair(0, 0));
        while (!pq.isEmpty()) {
            pair curr = pq.remove();
            if (!visited[curr.node]) {
                visited[curr.node] = true;
                for(int i=0;i<graph[curr.node].size();i++){
                    Edge edge=graph[curr.node].get(i);
                    int u=edge.src;
                    int v=edge.dest;
                    int w=edge.wt;
                    if(dist[u]+w<dist[v]){
                        dist[v]=dist[u]+w;
                        pq.add(new pair(v,dist[v]));
                    }

                }

            }
        }


        for(int i=0;i<V;i++){
            System.out.println("Vertex " + i + " shortest distance from source " + src + " is = " +dist[i]);
        }

    }





    public static void main(String [] args){
        int V=6;
        ArrayList<Edge> graph [] =new ArrayList[V];
        createGraph(graph);
        Dijkstra(graph,0,V);

        

    }
    
}
