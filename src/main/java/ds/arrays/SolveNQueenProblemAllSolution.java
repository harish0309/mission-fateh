package ds.arrays;

import java.util.ArrayList;
import java.util.List;

/** Created by HARISH on 24- 07- 2018 */
// Sample Output
//        #Q##
//        ###Q
//        Q###
//        ##Q#
//        =========
//        ##Q#
//        Q###
//        ###Q
//        #Q##
//        =========
public class SolveNQueenProblemAllSolution {
  public static void main(String[] args) {
    SolveNQueenProblemAllSolution solveNQueenProblemAllSolution =
        new SolveNQueenProblemAllSolution();
    List<List<String>> result = new ArrayList<>();
    Position[] positions = new Position[4];
    solveNQueenProblemAllSolution.solveProblem(0, 4, result, positions);
    result
        .stream()
        .forEach(
            solutions -> {
              for (String s : solutions) {
                System.out.println(s);
              }
              System.out.println("=========");
            });
  }

  private void solveProblem(int row, int n, List<List<String>> result, Position[] positions) {
    if (row == n) {
      StringBuffer buff = new StringBuffer();
      List<String> oneResult = new ArrayList<>();
      for (Position p : positions) {
        for (int i = 0; i < n; i++) {
          if (p.col == i) {
            buff.append("Q ");
          } else {
            buff.append("# ");
          }
        }
        oneResult.add(buff.toString());
        buff = new StringBuffer();
      }
      result.add(oneResult);
      return;
    }

    for (int col = 0; col < n; col++) {
      boolean foundSafe = true;

      for (int q = 0; q < row; q++) {
        if (positions[q].row == row // check for row attack
            || positions[q].col == col // check for col attack
            || positions[q].col + positions[q].row == row + col // check for left diagonal attack
            || positions[q].row - positions[q].col == row - col) // check for right diagonal attack
        {
          foundSafe = false;
          break;
        }
      }
      if (foundSafe) {
        positions[row] = new Position(row, col);
        solveProblem(row + 1, n, result, positions);
      }
    }
  }

  private class Position {
    int row;
    int col;

    Position(int row, int col) {
      this.row = row;
      this.col = col;
    }
  }
}
