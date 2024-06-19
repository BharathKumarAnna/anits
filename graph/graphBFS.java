package graph;

import java.util.*;

public class graphBFS {
    private static Map<String, List<String>> graph = new HashMap<>();
    private static List<String> queue = new ArrayList<>();

    public static void addNodes(String v) {
        if (graph.containsKey(v)) {
            System.out.println(v + " is already present in the graph.");
        } else {
            graph.put(v, new ArrayList<>());
        }
    }

    public static void addEdge(String v1, String v2) {
        if (!graph.containsKey(v1)) {
            System.out.println(v1 + " is not present.");
        } else if (!graph.containsKey(v2)) {
            System.out.println(v2 + " is not present in the graph.");
        } else {
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }
    }

    // BFS traversal in adjacency list
    public static void bfs(List<String> visited, Map<String, List<String>> graph, String node) {
        visited.add(node);
        queue.add(node);

        while (!queue.isEmpty()) {
            String n = queue.remove(0);
            System.out.println(n);

            for (String i : graph.get(n)) {
                if (!visited.contains(i)) {
                    visited.add(i);
                    queue.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<String> visited = new ArrayList<>();
        addNodes("A");
        addNodes("B");
        addNodes("C");
        addNodes("D");
        addNodes("E");
        addEdge("A", "B");
        addEdge("B", "E");
        addEdge("A", "C");
        addEdge("A", "D");
        addEdge("B", "D");
        addEdge("C", "D");
        addEdge("E", "D");
        System.out.println(graph);
        System.out.println("Following is the BFS search:");
        bfs(visited, graph, "A");
    }
}
