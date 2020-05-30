/*
 * Copyright (c) 2020 Anthony Li
 *
 * This source code is licensed under the MIT license (see LICENSE for details)
 */

package com.anthli.learning.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utils {
  /**
   * Prints the array delimited by commas.
   *
   * @param array
   *   The array to print.
   */
  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (i < array.length - 1) {
        System.out.print(array[i] + ", ");
      }
      else {
        System.out.print(array[i]);
      }
    }

    System.out.print("\n");
  }

  /**
   * Generates an array of integers of the given size in random order. The first
   * element starts at 1.
   *
   * @param size
   *   The size of the random array.
   * @return
   *   An array of integers in random order.
   */
  public static int[] generateRandomArray(int size) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      list.add(i + 1);
    }

    Collections.shuffle(list);

    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = list.get(i);
    }

    return arr;
  }
}