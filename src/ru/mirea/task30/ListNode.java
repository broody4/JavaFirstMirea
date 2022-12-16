package ru.mirea.task30;

import java.awt.*;

public class ListNode {
    MenuItem item;
    ListNode prevItem;
    ListNode nextItem;

    ListNode(MenuItem item, ListNode parent){
        this.item = item;
        this.prevItem = parent;
    }
}