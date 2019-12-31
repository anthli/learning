package com.anthli.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utils {
  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (i < arr.length - 1) {
        System.out.print(arr[i] + ", ");
      }
      else {
        System.out.print(arr[i]);
      }
    }

    System.out.print("\n");
  }

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