import java.util.ArrayList;

public class Cycle_Detection_Undirected_Unweighted_Graph {

    static class Edge {
        int src;
        int dest;
        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void CreateGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 0)); 
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 4)); 

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
    }

    public static boolean isCycleUndirected(ArrayList<Edge>[] graph, boolean[] vis, int curr, int parent) {
        vis[curr] = true;
        for (Edge e : graph[curr]) {
            if (vis[e.dest] && e.dest != parent) {
                return true;
            } else if (!vis[e.dest]) {
                if (isCycleUndirected(graph, vis, e.dest, curr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        CreateGraph(graph);
        boolean[] vis = new boolean[V];
        boolean isCycle = false;

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (isCycleUndirected(graph, vis, i, -1)) {
                    isCycle = true;
                    break;
                }
            }
        }

        if (isCycle) {
            System.out.println("Graph contains a cycle");
        } else {
            System.out.println("Graph does not contain a cycle");
        }
    }
}
