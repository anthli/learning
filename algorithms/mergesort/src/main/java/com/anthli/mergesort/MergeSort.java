package com.anthli.mergesort;

/**
 * An implementation of the merge sort algorithm.
 */
public class MergeSort {
  /**
   * Divides the given array in two partitions: one from left to mid, another
   * from mid + 1 to right.
   *
   * @param array
   *        The array to sort.
   * @param left
   *        The starting index for partitioning the array.
   * @param mid
   *        The middle index for partitioning the array.
   * @param right
   *        The ending index for partitioning the array.
   */
  private void mergeSort(int[] array, int left, int mid, int right) {
    // Create a copy of the original array
    int[] copy = new int[array.length];

    System.arraycopy(array, 0, copy, 0, array.length);

    // Starting position for left sub-array
    int i = left;
    // Starting position for right sub-array
    int j = mid + 1;
    // Position of the to-be sorted array
    int k = left;

    // Sort both left and right sub-arrays. Either i or j will hit its upper
    // bound, but not both. If i == mid, then the left sub-array is sorted.
    // Otherwise if j == right, then the right sub-array will be sorted
    while (i <= mid && j <= right) {
      if (copy[i] < copy[j]) {
        array[k] = copy[i];
        i++;
      }
      else {
        array[k] = copy[j];
        j++;
      }

      k++;
    }

    // Copy the remaining elements in the left sub-array into array
    while (i <= mid) {
      array[k] = copy[i];
      i++;
      k++;
    }

    // Copy the remaining elements in the right sub-array into array
    while (j <= right) {
      array[k] = copy[j];
      j++;
      k++;
    }
  }

  /**
   * Runs the merge sort algorithm on the given array with the starting and
   * ending indices of the array.
   *
   * @param array
   *        The array to sort.
   * @param left
   *        The starting index for partitioning the array.
   * @param right
   *        The ending index for partitioning the array.
   */
  public void mergeSort(int[] array, int left, int right) {
    if (left < right) {
      int middle = (left + right) / 2;

      mergeSort(array, left, middle);
      mergeSort(array, middle + 1, right);
      mergeSort(array, left, middle, right);
    }
  }
}