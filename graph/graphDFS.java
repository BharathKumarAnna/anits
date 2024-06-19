package graph;

import java.util.*;

public class graphDFS {
    private static Map<String, List<String>> graph = new HashMap<>();

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

    // DFS traversal in adjacency list
    public static void DFS(String node, Set<String> visited, Map<String, List<String>> graph) {
        if (!graph.containsKey(node)) {
            System.out.println("Node is not present.");
            return;
        }
        if (!visited.contains(node)) {
            System.out.println(node);
            visited.add(node);
            for (String i : graph.get(node)) {
                DFS(i, visited, graph);
            }
        }
    }

    public static void main(String[] args) {
        Set<String> visited = new HashSet<>();
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
        System.out.println("Following is the DFS search:");
        DFS("A", visited, graph);
    }
}

