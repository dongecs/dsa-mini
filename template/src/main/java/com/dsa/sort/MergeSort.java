package com.dsa.sort;

/**
 * 归并排序
 */
public class MergeSort implements Sort{

    @Override
    public void sort(int[] arr, int n) {
        mergeSortInner(arr, 0, n-1);
    }

    private void mergeSortInner(int[] arr, int p, int r) {
        if (p >= r) {
            return ;
        }
        int q = (p+r)/2;
        mergeSortInner(arr, p, q);
        mergeSortInner(arr, q+1, r);
        merge(arr, p, q, r);
    }

    private void merge(int[] arr, int p, int q, int r) {
        int n = r-p+1;
        int tmp[] = new int[n];

        int i = 0, pi = p, qi = q+1;
        while (pi <= q && qi <= r) {
            if (arr[pi] < arr[qi]) {
                tmp[i] = arr[pi++];
            } else {
                tmp[i] = arr[qi++];
            }
            ++i;
        }

        int start = qi, end = r;
        if (qi > r) {
            start = pi;
            end = q;
        }

        for (; start <= end; ++start) {
            tmp[i++] = arr[start];
        }

        for (int j = 0; j < n; ++j) {
            arr[p+j] = tmp[j];
        }
    }

}
