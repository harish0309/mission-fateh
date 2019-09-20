package ds.graph;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by HARISH on 20- 09- 2019
 */
/*
 * Adjacency Matrix for the graph
 *   |A B C D
 * --|-------
 * A |0 1 0 1
 * B |0 0 1 0
 * C |1 0 0 1
 * D |0 0 0 0
 *
 * Algorithm
 *
 * An array is maintained to store the vertex information
 *   0   1   2   3
 * -----------------
 * | A | B | C | D |
 * -----------------
 *
 * A set is maintained to store the visited node information
 *
 * Steps:
 *
 * 1. Create a queue (Q).
 * 2. Enqueue the stating vertex index (for 'A' it it 0)
 *
 *  while(Q is not empty)
 *      # Dequeue a vertex
 *      # print that vertex
 *      # now enqueue all the adjacent unvisited vertex
 *
 * */

public class BFS {


    public static void main(String[] args) {
        int[][] M = {{0, 1, 0, 1}, {0, 0, 1, 0}, {1, 0, 0, 1}, {0, 0, 0, 0}};
        List<String> asList = Arrays.asList("A", "B", "C", "D");
        bfsTraversal(M, asList);
    }

    private static void bfsTraversal(int[][] M, List<String> vertexList) {
        Queue<Integer> q = new LinkedBlockingQueue<>(vertexList.size());
        q.add(0);
        Set<Integer> visitedVertices = new HashSet<>();
        visitedVertices.add(0);
        while (!q.isEmpty()) {
            int j = 0;
            int vIdx = q.poll();
            System.out.print(vertexList.get(vIdx) + " ");
            while (j < vertexList.size()) {
                if (M[vIdx][j] == 1 && !visitedVertices.contains(j)) {
                    q.add(j);
                    visitedVertices.add(j);
                }
                j++;
            }
        }

    }
}
