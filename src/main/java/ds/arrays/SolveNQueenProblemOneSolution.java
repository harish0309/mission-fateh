package ds.arrays;

import java.util.Arrays;

/** Created by HARISH on 24- 07- 2018 */
public class SolveNQueenProblemOneSolution {
  public static void main(String[] args) {
    SolveNQueenProblemOneSolution solveNQueenProblem = new SolveNQueenProblemOneSolution();
    Position[] positions = solveNQueenProblem.solveNQueenOneSolution(4);
    Arrays.stream(positions)
        .forEach(
            position -> {
              System.out.println("(" + position.row + " ," + position.col + ")");
            });
  }

  public Position[] solveNQueenOneSolution(int n) {
    Position[] positions = new Position[n];
    boolean hasSolution =
        solveProblem(n, 0, positions); // n = size of board, current row, queen position array
    if (hasSolution) {
      return positions;
    } else {
      return new Position[0];
    }
  }

  private boolean solveProblem(int n, int row, Position[] positions) {
    if (n == row) { // check if all the rows are covered
      return true;
    }

    int col;
    // now go to each column in the current row.
    for (col = 0; col < n; col++) {
      boolean foundSafe = true;

      // check if the current position [row][col] is safe from attacks from other queens.
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
      if (foundSafe) { // if found safe then add this position to safe positions list
        positions[row] = new Position(row, col);
        if (solveProblem(n, row + 1, positions)) { // check for safe position in next row
          return true;
        }
      }
    }

    return false;
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
