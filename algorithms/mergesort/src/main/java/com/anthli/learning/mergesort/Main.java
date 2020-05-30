/*
 * Copyright (c) 2020 Anthony Li
 *
 * This source code is licensed under the MIT license (see LICENSE for details)
 */

package com.anthli.learning.mergesort;

import com.anthli.learning.util.Utils;

public class Main {
  private static void runMergeSort() {
    MergeSort mergesort = new MergeSort();
    int[] arr = Utils.generateRandomArray(50);

    Utils.printArray(arr);
    mergesort.mergeSort(arr, 0, arr.length - 1);
    Utils.printArray(arr);
  }

  public static void main(String[] args) {
    runMergeSort();
  }
}