package com.dsa.search;

import java.util.Random;

/**
 * binary Search
 */
public class BinarySearch {

    /**
     * binary Search,find the target in the array. return the array's index
     * @param arr
     * @param target
     * @return
     */
    public static int bsearch(int[] arr, int target){
        int left = 0, right = arr.length - 1, mid;
        while (left <= right) {
            mid = left+((right-left)>>1);
            if (arr[mid] > target) {
                right = mid -1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     *
     * @param arr
     * @param left
     * @param right
     * @param target
     * @return
     */
    public static int bsearch(int[] arr, int left, int right, int target) {
        int mid = left+((right-left)>>1);
        if (arr[mid] == target) {
            return mid;
        }
        if (left > right) {
            return -1;
        }
        if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
        return bsearch(arr, left, right, target);
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8, 12, 14, 17, 22, 24, 34};
        Random random = new Random();
        for (int i = 0; i  < 10 ; ++i) {
            int index = random.nextInt(arr.length);
//            int result = BinarySearch.bsearch(arr, arr[index]);
            int result = BinarySearch.bsearch(arr, 0, arr.length-1, arr[index]);
            System.out.println(index + " " + result);
        }

        int result = BinarySearch.bsearch(arr, 0, arr.length-1, 2);
        System.out.println(result);
    }
}
