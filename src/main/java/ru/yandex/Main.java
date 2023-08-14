package ru.yandex;

import ru.yandex.tasks.Task1BubbleSort;
import ru.yandex.tasks.Task2SelectionSort;
import ru.yandex.tasks.Task3InsertionSort;
import ru.yandex.tasks.Task4DFS;
import ru.yandex.tasks.Task5BFS;
import ru.yandex.tasks.Task6BraceBalance;
import ru.yandex.tasks.Task7PrimeNumbers;
import ru.yandex.tasks.Task8BinarySearch;

public class Main {
    public static void main(String[] args) {
        Task1BubbleSort.selfCheck();
        Task2SelectionSort.selfCheck();
        Task3InsertionSort.selfCheck();
        Task4DFS.selfCheck();
        Task5BFS.selfCheck();
        Task6BraceBalance.selfCheck();
        Task7PrimeNumbers.selfCheck();
        Task8BinarySearch.selfCheck();
    }
}