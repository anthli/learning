package com.anthli.mergesort;

public class Mergesort {
  private void merge(int[] arr, int left, int mid, int right) {
    // Create a copy of the original arr
    int[] copy = new int[arr.length];

    System.arraycopy(arr, 0, copy, 0, arr.length);

    // Starting position for left sub-array
    int i = left;
    // Starting position for right sub-array
    int j = mid + 1;
    // Position of the to-be sorted array
    int k = left;

    // Sort both left and right sub-arrays
    // Either i or j will hit its upper bound, but not both
    // i = mid == left sub-array is sorted
    // j = right == right sub-array is sorted
    while (i <= mid && j <= right) {
      if (copy[i] < copy[j]) {
        arr[k] = copy[i];
        i++;
      }
      else {
        arr[k] = copy[j];
        j++;
      }

      k++;
    }

    // Copy the remaining elements in the left sub-array into arr
    while (i <= mid) {
      arr[k] = copy[i];
      i++;
      k++;
    }

    // Copy the remaining elements in the right sub-array into arr
    while (j <= right) {
      arr[k] = copy[j];
      j++;
      k++;
    }
  }

  public void mergesort(int[] arr, int left, int right) {
    if (left < right) {
      int middle = (left + right) / 2;

      mergesort(arr, left, middle);
      mergesort(arr, middle + 1, right);
      merge(arr, left, middle, right);
    }
  }
}