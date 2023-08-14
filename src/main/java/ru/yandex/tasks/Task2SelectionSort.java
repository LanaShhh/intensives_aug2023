package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task2SelectionSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой выбором!) numbers
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        int n = numbers.size();
        for (int i = 0; i < n - 1; ++i) {
            int elem = numbers.get(n-1);
            int ind = n-1;
            for (int j = i; j < n; ++j) {
                if (numbers.get(j) < elem) {
                    elem = numbers.get(j);
                    ind = j;
                }
            }
            Collections.swap(numbers, ind, i);
        }
        return numbers;
    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assert output.equals(sort(input));
    }
}
