package ru.mirea.task23.LinkedQueue;

class QNode {
    int key;
    QNode next;

    public QNode(int key)
    {
        this.key = key;
        this.next = null;
    }
}