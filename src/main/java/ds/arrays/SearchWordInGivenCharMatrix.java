package ds.arrays;

/** Created by HARISH on 16- 03- 2019 */
// #BACK TRACKING
public class SearchWordInGivenCharMatrix {

  private int[][] solution;
  private int path = 1;

  public static void main(String[] args) {
    char[][] matrix = {
      {'t', 'z', 'x', 'c'}, {'b', 'd', 'a', 's'}, {'p', 'r', 'q', 'r'}, {'u', 'v', 'w', 'x'},
    };
    String word = "car";

    SearchWordInGivenCharMatrix givenCharMatrix = new SearchWordInGivenCharMatrix();
    if (givenCharMatrix.searchWord(matrix, word)) {
      System.out.println("word found");
    } else {
      System.out.println("Not found");
    }
  }

  private boolean searchWord(char[][] matrix, String word) {
    int N = matrix.length;
    solution = prepareEmptyMatrix(N);

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (search(matrix, word, i, j, 0, N)) {
          return true;
        }
      }
    }
    return false;
  }

  private boolean search(char[][] matrix, String word, int r, int c, int idx, int N) {

    // check if the char at (r,c) is same as char at idx in word, if not then return
    // Also check if this (r,c) is already visited
    if (solution[r][c] != 0 || matrix[r][c] != word.charAt(idx)) {
      return false;
    }

    // check if the word is already found, then return true
    if (idx == word.length() - 1) {
      solution[r][c] = path++;
      return true;
    }

    // If the char at (r,c) is valid, then check for other words in all 8 directions
    solution[r][c] = path++;

    // check up r-1, c
    if (r - 1 >= 0 && search(matrix, word, r - 1, c, idx + 1, N)) {
      return true;
    }

    // check down r+1, c
    if (r + 1 < N && search(matrix, word, r + 1, c, idx + 1, N)) {
      return true;
    }

    // check left r, c-1
    if (c - 1 >= 0 && search(matrix, word, r, c - 1, idx + 1, N)) {
      return true;
    }

    // check right r, c+1
    if (c + 1 < N && search(matrix, word, r, c + 1, idx + 1, N)) {
      return true;
    }

    // check diagonal left up r-1, c-1
    if (r - 1 >= 0 && c - 1 >= 0 && search(matrix, word, r - 1, c - 1, idx + 1, N)) {
      return true;
    }

    // check diagonal left down r+1, c-1
    if (r + 1 < N && c - 1 >= 0 && search(matrix, word, r + 1, c - 1, idx + 1, N)) {
      return true;
    }

    // check diagonal right up r-1, c+1
    if (r - 1 >= 0 && c + 1 < N && search(matrix, word, r - 1, c + 1, idx + 1, N)) {
      return true;
    }

    // check diagonal right down r+1, c+1
    if (r + 1 < N && c + 1 < N && search(matrix, word, r + 1, c + 1, idx + 1, N)) {
      return true;
    }

    // if not found
    solution[r][c] = 0;
    path--;
    return false;
  }

  private int[][] prepareEmptyMatrix(int N) {
    int[][] sol = new int[N][N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        sol[i][j] = 0;
      }
    }
    return sol;
  }
}
