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
}
