package com.dsa.sort;

/**
 * @author dongecs
 * @create 2019-03-01 0:25
 * @desc 排序算法
 **/
public class SortApp {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 8, 6, 0, 10, 9};
        Sort sort = new QuickSort();
        sort.sort(arr, arr.length);
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int d : arr) {
            System.out.println(d);
        }
    }
}
