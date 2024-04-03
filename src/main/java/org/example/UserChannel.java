package org.example;

public interface UserChannel<T extends Item> {
    void onItemBorrowed(T item);

    void onItemReturned(T item);

    void onItemReserved(T item);
}
