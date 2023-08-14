package ru.yandex;

import ru.yandex.tasks.Task1BubbleSort;
import ru.yandex.tasks.Task2SelectionSort;
import ru.yandex.tasks.Task3InsertionSort;
import ru.yandex.tasks.Task4DFS;

public class Main {
    public static void main(String[] args) {
        Task1BubbleSort.selfCheck();
        Task2SelectionSort.selfCheck();
        Task3InsertionSort.selfCheck();
        Task4DFS.selfCheck();
    }
}