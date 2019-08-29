package com.dsa.search;

/**
 * binary Search
 */
public class BinarySearch {

    /**
     * 常见二分搜索
     * @param arr the value array
     * @param target the target value
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
     * 递归实现
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

    /**
     * find the first equal value
     * @param arr
     * @param target
     * @return
     */
    public static int bsearchFindFirst(int[] arr, int target) {
        int left = 0, right = arr.length-1, mid;
        while (left <= right) {
            mid = left+((right-left)>>1);
            if (arr[mid] >= target) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        if (left < arr.length && arr[left] == target) {
            return left;
        }
        return -1;
    }

    /**
     * find the last equal value
     * @param arr
     * @param target
     * @return
     */
    public static int bsearchFindLast(int[] arr, int target) {
        int left = 0 , right = arr.length-1, mid;
        while (left <= right) {
            mid = left+((right-left)>>1);
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (right < arr.length && arr[right] == target) {
            return right;
        }
        return -1;
    }

    /**
     * find the first great or equeal value
     * @param arr
     * @param target
     * @return
     */
    public static int bsearchFindFirstGE(int[] arr, int target){
        int left = 0, right = arr.length-1, mid;
        while (left <= right) {
            mid = left + ((right-left)>>1);
            if (arr[mid] >= target) {
                if (mid == 0 || arr[mid-1] < target) {
                    return mid;
                } else {
                    right = mid -1;
                }
            } else if (arr[mid] < target) {
                left = mid + 1;
            }
        }
        return -1;
    }

    /**
     * find the last less or equeal value
     * @param arr
     * @param target
     * @return
     */
    public static int bsearchFindLastLE(int[] arr, int target) {
        int left = 0, right = arr.length-1, mid;
        while (left <= right) {
            mid = left+((right-left)>>1);
            if (arr[mid] <= target) {
                if (mid == arr .length-1 || arr[mid+1] > target) {
                    return mid;
                } else {
                    left = mid + 1;
                }
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8, 12, 14, 17, 22, 22, 24, 34};
        int fge = BinarySearch.bsearchFindFirstGE(arr, 22);
        int lle = BinarySearch.bsearchFindLastLE(arr, 22);
        System.out.printf(fge + " " + lle);
//        Random random = new Random();
//        for (int i = 0; i  < 10 ; ++i) {
//            int index = random.nextInt(arr.length);
//            int result = BinarySearch.bsearch(arr, arr[index]);
//            int result = BinarySearch.bsearch(arr, 0, arr.length-1, arr[index]);
//            int result = BinarySearch.bsearchFindLast(arr, arr[index]);
//            System.out.println(index + " " + result);
//        }
//
//        int result = BinarySearch.bsearchFindLast(arr, 22);
//        System.out.println(result);
    }
}
