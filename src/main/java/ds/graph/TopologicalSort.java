package ds.graph;

import java.util.HashSet;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/** Created by HARISH on 16- 05- 2020 */
public class TopologicalSort {

  public static void main(String[] args) {

    int[][] M =
        new int[][] {
          {0, 1, 1, 0, 0, 0, 0},
          {0, 0, 0, 0, 0, 0, 0},
          {0, 0, 0, 1, 0, 0, 0},
          {0, 0, 0, 0, 0, 1, 0},
          {0, 0, 0, 0, 0, 0, 1},
          {0, 0, 0, 0, 0, 0, 0},
          {0, 0, 0, 0, 0, 1, 0}
        };

    int n = M.length;
    Queue<Integer> q = new LinkedBlockingQueue<>();
    Stack<Integer> s = new Stack<>();
    HashSet<Integer> vSet = new HashSet<>();

    for (int i = 0; i < n; i++) {
      if (!vSet.contains(i)) {
        vSet.add(i);
        q.add(i);
        while (!q.isEmpty()) {
          int vIdx = q.poll();
          s.push(vIdx);
          int j = 0;

          while (j < n) {
            if (M[vIdx][j] == 1 && !vSet.contains(j)) {
              q.add(j);
              vSet.add(j);
            }
            j++;
          }
        }
      }
      while (!s.isEmpty()) {
        System.out.println(s.pop());
      }
    }
  }
}
