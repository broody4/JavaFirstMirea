package ru.mirea.task32;

public interface OrdersManager {
    int itemsQuantity(String itemName);

    int itemsQuantity(MenuItem item);

    Order[] getOrders();

    int ordersCostSummary();

    int ordersQuantity();
}
