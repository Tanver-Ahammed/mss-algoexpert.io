package algoexpert.io.graph;

import java.util.HashSet;
import java.util.Set;

public class CycleInGraph {

    public boolean cycleInGraph(int[][] edges) {
        for (int vertex = 0; vertex < edges.length; vertex++) {
            if (dfs(edges, vertex, new HashSet<>())) {
                return true;
            }
        }
        return false;
    }

    public static boolean dfs(int[][] edges, int vertex, Set<Integer> visited) {
        if (visited.contains(vertex))
            return true;
        visited.add(vertex);
        for (int edge : edges[vertex]) {
            if (dfs(edges, edge, visited))
                return true;
        }
        visited.remove(vertex);
        return false;
    }

}
