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

    /**
     * 插入排序
     * @param arr
     * @param n
     */
    public static void insertionSort(int[] arr, int n) {
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

    /**
     * 选择排序
     * @param arr
     * @param n
     */
    public static void selectionSort(int[] arr, int n) {
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

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 8, 6, 0};
//        bubbleSort(arr, arr.length);
//        insertionSort(arr, arr.length);
        selectionSort(arr, arr.length);
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int d : arr) {
            System.out.println(d);
        }
    }
}
