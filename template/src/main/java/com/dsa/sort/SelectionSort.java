package com.dsa.sort;

/**
 * 选择排序
 */
public class SelectionSort implements Sort {
    @Override
    public void sort(int[] arr, int n) {
        if (n <= 1) {
            return ;
        }
        for (int i = 0; i < n; ++i) {
            int minValue = arr[i];
            int minIndex = i;
            for (int j = i+1; j < n; ++j) {
                if (minValue > arr[j]) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            if (minValue != arr[i]) {
                int tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
    }
}
