package graph;

import java.util.ArrayList;
import java.util.List;

public class graphAdjacencyMatrix {
    private static List<String> nodes = new ArrayList<>();
    private static List<List<Integer>> graph = new ArrayList<>();
    private static int node_count = 0;

    public static void addNodes(String v) {
        if (nodes.contains(v)) {
            System.out.println(v + " is already present in the graph.");
        } else {
            node_count++;
            nodes.add(v);
            for (List<Integer> n : graph) {
                n.add(0);
            }
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < node_count; i++) {
                temp.add(0);
            }
            graph.add(temp);
        }
    }

    public static void printGraph() {
        for (int i = 0; i < node_count; i++) {
            for (int j = 0; j < node_count; j++) {
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void addEdge(String v1, String v2, int cost) {
        if (!nodes.contains(v1)) {
            System.out.println(v1 + " is not present.");
        } else if (!nodes.contains(v2)) {
            System.out.println(v2 + " is not present.");
        } else {
            int index1 = nodes.indexOf(v1);
            int index2 = nodes.indexOf(v2);
            graph.get(index1).set(index2, cost);
            graph.get(index2).set(index1, cost);
        }
    }

    public static void deleteNode(String v) {
        if (!nodes.contains(v)) {
            System.out.println(v + " is not present.");
        } else {
            int index1 = nodes.indexOf(v);
            node_count--;
            nodes.remove(v);
            graph.remove(index1);
            for (List<Integer> i : graph) {
                i.remove(index1);
            }
        }
    }

    public static void deleteEdge(String v1, String v2) {
        if (!nodes.contains(v1)) {
            System.out.println(v1 + " is not present.");
        } else if (!nodes.contains(v2)) {
            System.out.println(v2 + " is not present.");
        } else {
            int index1 = nodes.indexOf(v1);
            int index2 = nodes.indexOf(v2);
            graph.get(index1).set(index2, 0);
            graph.get(index2).set(index1, 0);
        }
    }

    public static void main(String[] args) {
        System.out.println("Before adding nodes: ");
        System.out.println(nodes);
        System.out.println(graph);

        addNodes("10");
        addNodes("20");
        addEdge("10", "20", 1);

        System.out.println("After adding nodes: ");
        System.out.println(nodes);
        printGraph();

        deleteNode("10");
        deleteEdge("10", "20");

        System.out.println("After deleting nodes: ");
        printGraph();
    }
}
