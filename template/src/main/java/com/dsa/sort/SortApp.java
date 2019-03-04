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

    private static void quickSort(int[] arr, int n) {
        quickSortInner(arr, 0, n - 1);
    }

    private static void quickSortInner(int[] arr, int p, int r) {
        if (p >= r) {
            return ;
        }
        int q = partition(arr, p, r);
        quickSortInner(arr, p, q-1);
        quickSortInner(arr, q+1, r);
    }

    private static int partition(int[] arr, int p, int r) {
        int i = p, j =p;
        int pori = arr[r];
        for (;j < r;++j) {
            if (arr[j] < pori) {
                if (i != j) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
                i++;
            }
        }

        int tmp = arr[i];
        arr[i] = arr[r];
        arr[r] = tmp;

        return i;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 8, 6, 0, 10, 9};
//        bubbleSort(arr, arr.length);
//        insertionSort(arr, arr.length);
//        selectionSort(arr, arr.length);
//        quickSort(arr, arr.length);
        Sort sort = new MergeSort();
        sort.sort(arr, arr.length);
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int d : arr) {
            System.out.println(d);
        }
    }
}
