package com.dsa.array;

/**
 *  静态数组，实现增删查
 */
public class StatisArray {

    private Object[] arr;

    private int size;

    private final int DEFAULT_CAPACITY = 10;

    public StatisArray() {
        arr = new Object[DEFAULT_CAPACITY];
    }

    public StatisArray(int size){
        arr = new Object[size];
    }

    public boolean add(Object obj){
        havaCapacity(size + 1);
        arr[size++] = obj;
        return true;
    }

    public Object get(int index){
        checkRange(index);
        return arr[index];
    }

    public boolean add(int index, Object obj) {
        havaCapacity(index);
        for (int i = 0; i < (size - index); ++i) {
            arr[size-i] = arr[size-i-1];
        }
        arr[index] = obj;
        size++;
        return true;
    }

    public boolean remove(int index) {
        checkRange(index);
        for (int i = index; i < size; ++i) {
            arr[i] = arr[i+1];
        }
        arr[--size] = null;
        return true;
    }

    private void checkRange(int index) {
        if (index > size || index < 0) {
            throw new IllegalArgumentException("access illeage index");
        }
    }

    private boolean havaCapacity(int index){
        if (index >= arr.length || index < 0) {
            return false;
        }
        return true;
    }

    public int getSize() {
        return size;
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
}
