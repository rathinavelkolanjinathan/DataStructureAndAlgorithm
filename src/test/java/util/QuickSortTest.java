package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 10/11/20 5:02 PM
 */

class QuickSortTest {

  @Test
  void testQuickSort1() {
    int[] arr = {7, 3, 9, 5, 4, 8, 0, 1};
    int[] sortedArray = {0, 1, 3, 4, 5, 7, 8, 9};

    QuickSort.quickSort(arr, 0, arr.length - 1);
    assertArrayEquals(sortedArray, arr);
  }

  @Test
  void testQuickSort2() {
    int[] arr = {7, 3, 9, 5, 4, 8, 0, 1, -1, -2, -6, -7, -3, -5, -99, -100, 9999, 34, 12, 5653, 1213, 6563};
    int[] sortedArray = {-100, -99, -7, -6, -5, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 12, 34, 1213, 5653, 6563, 9999};

    QuickSort.quickSort(arr, 0, arr.length - 1);
    assertArrayEquals(sortedArray, arr);
  }
}