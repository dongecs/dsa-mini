package com.dsa.array;

import java.util.Arrays;

/**
 *  简单动态数组
 *
 *  1).支持动态扩容
 *  2）支持动态缩容 TODO
 *  3）支持排序 TODO
 */
public class DynamicArray {

    private Object[] arr;

    private int size;

    private final Object[] DEFAULT_ARR = {};

    private final int DEFAULT_CAPACITY = 10;

    public DynamicArray(int size) {
        arr = new Object[size];
    }

    public DynamicArray(){
        arr = DEFAULT_ARR;
    }

    public boolean add(Object data){
        ensureCapacity(size + 1);
        arr[size++] = data;
        return true;
    }

    private void ensureCapacity(int minCapacity) {
        ensureCapacityInner(calc(minCapacity));
    }

    private int calc(int minCapacity) {
        if (arr == DEFAULT_ARR) {
            return Math.max(minCapacity, DEFAULT_CAPACITY);
        }
        return minCapacity;
    }


    private boolean ensureCapacityInner(int minCapacity){
        if (minCapacity > arr.length) {
            int oldCapacity = arr.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            arr = Arrays.copyOf(arr, newCapacity);
            return true;
        }
        return false;
    }

    public int size(){
        return size;
    }

    public Object get(int index){
        checkRange(index);
        return arr[index];
    }

    private void checkRange(int index){
        if (index > size || index < 0) {
            throw new IllegalArgumentException("access illegal index");
        }
    }
}
