package com.dsa.sort;

/**
 * 快速排序
 */
public class QuickSort implements Sort{

    @Override
    public void sort(int[] arr, int n) {
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
}
