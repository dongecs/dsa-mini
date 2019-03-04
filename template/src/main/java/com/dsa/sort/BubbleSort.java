package com.dsa.sort;

/**
 * 冒泡排序
 */
public class BubbleSort implements Sort {
    @Override
    public void sort(int[] arr, int n) {
        if (n <= 1) {
            return ;
        }
        for (int i = 0; i < n - 1; i++) {
            boolean hasSwap = false;
            for (int j = 0; j < n - i - 1; j ++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    hasSwap = true;
                }
            }
            if (!hasSwap) {
                break;
            }
        }
    }
}
