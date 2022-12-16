package ru.mirea.task23.LinkedQueue;

public class LinkedQueue {
    QNode front, rear;
    int size;
    public LinkedQueue() { this.front = this.rear = null; size = 0; }
    void enqueue(int key)
    {
        ++size;
        QNode temp = new QNode(key);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }

    void dequeue()
    {
        size = (Math.max(size - 1, 0));
        if (this.front == null)
            return;
        QNode temp = this.front;
        this.front = this.front.next;
        if (this.front == null)
            this.rear = null;
    }
    public boolean isEmpty(){
        return this.front == null;
    }
}