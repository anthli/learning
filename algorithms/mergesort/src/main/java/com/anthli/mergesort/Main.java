package com.anthli.mergesort;

import com.anthli.util.Utils;

public class Main {
  private static void runMergesort() {
    Mergesort mergesort = new Mergesort();
    int[] arr = Utils.generateRandomArray(50);

    Utils.printArray(arr);
    mergesort.mergesort(arr, 0, arr.length - 1);
    Utils.printArray(arr);
  }

  public static void main(String[] args) {
    runMergesort();
  }
}