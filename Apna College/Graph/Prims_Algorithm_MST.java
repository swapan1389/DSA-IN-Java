import java.util.*;

public class Prims_Algorithm_MST {
    static class Edge {
        int edgSrc;
        int edgDest;
        int edgWt;

        public Edge(int edgSrc, int edgDest, int edgWt) {
            this.edgSrc = edgSrc;
            this.edgDest = edgDest;
            this.edgWt = edgWt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    static class Pair implements Comparable<Pair> {
        int node;
        int cost;
        int parentNode; // New field to store the parent node that led to this node

        public Pair(int node, int cost, int parentNode) {
            this.node = node;
            this.cost = cost;
            this.parentNode = parentNode;
        }

        @Override
        public int compareTo(Pair o) {
            return this.cost - o.cost;
        }
    }

    public static void Prims_Algorithm(ArrayList<Edge> graph[], int V) {
        boolean[] visited = new boolean[V];
        int[] parent = new int[V]; // Stores the parent of each node in the MST
        Arrays.fill(parent, -1); // Initialize parent array with -1 (no parent)

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        // Start with node 0, cost 0, and no parent (-1 as it's the starting node)
        pq.add(new Pair(0, 0, -1)); 
        int totalCost = 0;

        System.out.println("Edges in the Minimum Spanning Tree:");

        while (!pq.isEmpty()) {
            Pair p = pq.remove();

            if (!visited[p.node]) {
                visited[p.node] = true;
                totalCost += p.cost;

                // If this is not the starting node, print the edge
                if (p.parentNode != -1) {
                    System.out.println("Edge: " + p.parentNode + " -- " + p.node + " (Weight: " + p.cost + ")");
                }

                for (Edge e : graph[p.node]) {
                    if (!visited[e.edgDest]) {
                        pq.add(new Pair(e.edgDest, e.edgWt, e.edgSrc)); // Pass the source as parent
                    }
                }
            }
        }
        System.out.println("The total cost of minimum spanning tree is = " + totalCost);
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        Prims_Algorithm(graph, V);
    }
}