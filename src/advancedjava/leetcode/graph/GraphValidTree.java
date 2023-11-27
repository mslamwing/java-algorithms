package advancedjava.leetcode.graph;

import java.util.*;

public class GraphValidTree {

    public static boolean validTree(int n, int[][] edges) {
        if (edges.length != n - 1) {
            // A valid tree must have exactly n-1 edges
            return false;
        }

        // Create an adjacency list
        Map<Integer, List<Integer>> adjacencyList = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adjacencyList.put(i, new ArrayList<>());
        }

        for (int[] edge : edges) {
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]);
        }

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        visited.add(0);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int neighbor : adjacencyList.get(node)) {
                if (visited.contains(neighbor)) {
                    continue;
                }
                visited.add(neighbor);
                queue.offer(neighbor);
            }
        }

        return visited.size() == n;
    }

    public static void main(String[] args) {
        int n = 5;
//        int[][] edges = new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 4}};
//        int[][] edges = new int[][]{{0,1},{1,2},{2,3},{1,3},{1,4}};
        int[][] edges = new int[][]{{0,1},{2,3}};
        System.out.println(validTree(n, edges));
    }
}
