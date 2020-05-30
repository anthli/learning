/*
 * Copyright (c) 2020 Anthony Li
 *
 * This source code is licensed under the MIT license (see LICENSE for details)
 */

package com.anthli.learning.mergesort;

import com.anthli.learning.util.Utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortTest {
  private static final int[] SORTED_ARRAY = new int[] { 1, 2, 3, 4, 5};

  private MergeSort mergeSort = new MergeSort();

  @Test
  public void testMergeSort() {
    int[] unsortedArray = Utils.generateRandomArray(5);
    Assertions.assertFalse(Arrays.equals(SORTED_ARRAY, unsortedArray));

    mergeSort.mergeSort(unsortedArray, 0, unsortedArray.length - 1);
    Assertions.assertArrayEquals(SORTED_ARRAY, unsortedArray);
  }
}