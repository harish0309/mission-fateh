package ds.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/** Created by HARISH on 03- 10- 2020 */
public class MergeKSortedArrays {

  public static void main(String[] args) {
    Integer[] a = {1, 3, 6, 8};
    Integer[] b = {5, 7, 12, 14};
    Integer[] c = {2, 4, 9, 11};
    Integer[] d = {10, 13, 15, 18};

    List<Integer[]> list = new ArrayList<>();
    //    list.add(a);
    //    list.add(b);
    //    list.add(c);
    //    list.add(d);

    list.add(new Integer[] {1, 3});
    list.add(new Integer[] {2, 4, 6, 7, 9});

    merge(list);

    //
  }

  private static Integer[] merge(List<Integer[]> sortedList) {
    int size = sortedList.stream().mapToInt(i -> i.length).sum();
    int[] idx = new int[sortedList.size()];
    Integer[] A = new Integer[size];
    PriorityQueue<Integer> heap = new PriorityQueue<>(sortedList.size(), Comparator.naturalOrder());

    for (int i = 0; i < size; i++) {

      for (int j = 0; j < sortedList.size(); j++) {
        Integer num = sortedList.get(j)[idx[j]];
        heap.add(num);
      }

      Integer min = heap.poll();
      A[i] = min;
      for (int k = 0; k < sortedList.size(); k++) {
        if (sortedList.get(k)[idx[k]].equals(min)) {
          int arrIdx = idx[k];
          if (arrIdx < sortedList.get(k).length - 1) {
            idx[k] = arrIdx + 1;
          } else {
            sortedList.get(k)[idx[k]] = Integer.MAX_VALUE;
          }
          break;
        }
      }

      heap.clear();

      //
    }
    return A;
  }
}
