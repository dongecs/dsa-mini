package com.dsa.sort;

/**
 * 插入排序
 */
public class InsertionSort implements Sort {
    @Override
    public void sort(int[] arr, int n) {
        if (n <= 1) {
            return ;
        }
        for (int i = 1; i < n; ++i) {
            int tmp = arr[i];
            int j = i - 1;
            for (; j >= 0; --j) {
                if (tmp < arr[j]) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }
}
