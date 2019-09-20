package ds.graph;

import java.util.*;

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
 * 1. Create a Stack (S).
 * 2. Push the starting vertex index (for 'A' it it 0) to the stack and print this.
 *
 *  while(S is not empty)
 *      # v = Peek from the stack
 *      # now push on of the unvisited adjacent vertex of v and print it
 *      # if no adjacent vertex is found then pop from the stack
 *
 * */

public class DFS {

    public static void main(String[] args) {
        int[][] M = {{0, 1, 0, 1}, {0, 0, 1, 0}, {1, 0, 0, 1}, {0, 0, 0, 0}};
        List<String> asList = Arrays.asList("A", "B", "C", "D");
        bfsTraversal(M, asList);
    }

    private static void bfsTraversal(int[][] M, List<String> asList) {

        Stack<Integer> s = new Stack<>();
        s.push(0);
        System.out.print(asList.get(0) + " ");
        Set<Integer> visitedVertices = new HashSet<>();
        visitedVertices.add(0);
        while (!s.isEmpty()) {
            int vIdx = s.peek();
            int unvisited = getUnvisitedAdjVertex(M, vIdx, visitedVertices);
            if (unvisited != -1) {
                s.push(unvisited);
                visitedVertices.add(unvisited);
                System.out.print(asList.get(unvisited) + " ");
            } else {
                s.pop();
            }

        }
    }

    private static int getUnvisitedAdjVertex(int[][] M, int vIdx, Set<Integer> visitedVertices) {

        for (int i = 0; i < 4; i++) {
            if (M[vIdx][i] == 1 && !visitedVertices.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
