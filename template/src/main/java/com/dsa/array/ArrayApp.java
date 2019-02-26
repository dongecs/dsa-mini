package com.dsa.array;

/**
 * 数组常用操作
 */
public class ArrayApp {

    public static void dynamicApp(){
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add("a");
    }

    public static void statisApp(){
        StatisArray statisArray = new StatisArray();
        statisArray.add("a");
        statisArray.add("b");
        statisArray.add("c");
        statisArray.add(1, "z");
        statisArray.remove(1);
    }

    /**
     * 合并有序数组(升序)
     * @param arr1 有序数组
     * @param arr2 有序数组
     * @return
     */
    public static int[] mergeArrs(int[] arr1, int[] arr2){
        int mgIndex = 0, index1 = 0, index2 = 0;
        int totalLen = arr1.length + arr2.length;
        int[] mergeArr = new int[totalLen];
        while (mgIndex < totalLen) {
            if (arr1[index1] < arr2[index2]) {
                mergeArr[mgIndex++] = arr1[index1++];
            } else {
                mergeArr[mgIndex++] = arr2[index2++];
            }
            if (index1 == arr1.length) {
                for (int i = index2; i < arr2.length; ++i) {
                    mergeArr[mgIndex++] = arr2[i];
                }
            } else if (index2 == arr2.length) {
                for (int i = index1; i < arr1.length; ++i) {
                    mergeArr[mgIndex++] = arr1[i];
                }
            }
        }
        return mergeArr;
    }

    private static void testMergeData() {
        int[] arr1 = {1, 4, 7, 10, 11, 16, 17};
        int[] arr2 = {0, 1, 5, 8, 10};
        int[] mergeArrs = mergeArrs(arr1, arr2);
        for (int arrNum : mergeArrs) {
            System.out.print(arrNum + " ");
        }
    }

    public static void main(String[] args) {
//        dynamicApp();
//        statisApp();
        testMergeData();
    }
}
