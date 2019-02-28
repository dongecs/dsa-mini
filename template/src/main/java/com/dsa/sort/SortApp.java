package com.dsa.sort;

/**
 * @author dongecs
 * @create 2019-03-01 0:25
 * @desc 排序算法
 **/
public class SortApp {

    /**
     * 冒泡排序
     * @param arr
     * @param n
     */
    public static void bubbleSort(int[] arr, int n) {
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

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 8, 6, 0};
        bubbleSort(arr, arr.length);
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int d : arr) {
            System.out.println(d);
        }
    }
}
