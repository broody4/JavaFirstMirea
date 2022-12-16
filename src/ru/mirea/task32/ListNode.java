package ru.mirea.task32;

import java.io.Serializable;

public class ListNode implements Serializable {
    MenuItem item;
    ListNode prevItem;
    ListNode nextItem;

    ListNode(MenuItem item, ListNode parent){
        this.item = item;
        this.prevItem = parent;
    }
}
