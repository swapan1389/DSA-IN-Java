import java.util.*;

public class Kosarajus_Algorithm_Implementation {
    static class Edge{
        int src;
        int dest;
        public Edge(int src,int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> [] graph,int V){
        for(int i=0;i<V;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));
    }

    public static void topologicalSort(ArrayList<Edge> [] graph,int curr,Stack<Integer> st,boolean [] visited){
        visited[curr] = true;
        for(Edge e: graph[curr]){
            if(!visited[e.dest]){
                topologicalSort(graph,e.dest,st,visited);
            }
        }
        st.push(curr);
    }

    public static void createTranspose(ArrayList<Edge> [] graph,ArrayList<Edge> [] TransposeGraph,int V){
        for(int i=0;i<V;i++){
            TransposeGraph[i]=new ArrayList<>();
        }

        for(int u=0;u<V;u++){
            for(Edge e: graph[u]){
                TransposeGraph[e.dest].add(new Edge(e.dest,u));
            }
        }
    }

    public static void dfs(ArrayList<Edge> [] TransposeGraph,int curr,boolean [] visited2){
        System.out.print(curr+" ");
        visited2[curr] = true;
        for(Edge e: TransposeGraph[curr]){
            if(!visited2[e.dest]){
                dfs(TransposeGraph,e.dest,visited2);
            }
        }
    }

    public static void Kosaraju_Algo (ArrayList<Edge> [] graph,int V){
        // Step 1: Get Nodes in Stack (Topological Stack)
        Stack<Integer> st=new Stack<>();
        boolean [] visited = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                topologicalSort(graph,i,st,visited);
            }
        }

        // Step 2: Transpose the graph
        ArrayList<Edge> [] TransposeGraph=new ArrayList[V];
        createTranspose(graph,TransposeGraph,V);

        // Step 3: Perform DFS according to the stack node on the Transpose graph
        boolean [] visited2 = new boolean[V];
        while(!st.isEmpty()){
            int curr = st.pop();
            if(!visited2[curr]){
                dfs(TransposeGraph,curr,visited2);
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge> [] graph=new ArrayList[V];
        createGraph(graph,V);
        Kosaraju_Algo(graph,V);


    }
}