package ru.yandex;

import ru.yandex.tasks.Task1BubbleSort;
import ru.yandex.tasks.Task2SelectionSort;
import ru.yandex.tasks.Task3InsertionSort;

public class Main {
    public static void main(String[] args) {
        Task1BubbleSort.selfCheck();
        Task2SelectionSort.selfCheck();
        Task3InsertionSort.selfCheck();
    }
}