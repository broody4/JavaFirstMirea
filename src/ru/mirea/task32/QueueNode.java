package ru.mirea.task32;


import java.io.Serializable;

public class QueueNode implements Serializable {
    QueueNode next;
    QueueNode prev;
    Order value;

    QueueNode(Order value, Customer customer, QueueNode prev) {
        this.prev = prev;
        value.setCustomer(customer);
        this.value = value;
        next = null;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }
}
