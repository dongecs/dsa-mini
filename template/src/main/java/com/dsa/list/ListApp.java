package com.dsa.list;

/**
 * @author dongecs
 * @create 2019-02-28 0:20
 * @desc 链表操作
 **/
public class ListApp {

    public static void main(String[] args) {
        SingleList singleList = new SingleList();
        singleList.append(1);
        singleList.append(2);
        singleList.append(5);
        singleList.showList();
    }
}
