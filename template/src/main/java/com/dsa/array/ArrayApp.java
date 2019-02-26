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

    public static void main(String[] args) {
//        dynamicApp();
//        statisApp();
    }
}
