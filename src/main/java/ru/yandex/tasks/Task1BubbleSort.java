package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1BubbleSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой пузырьком!) numbers
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        int n = numbers.size();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - i - 1; ++j) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    Collections.swap(numbers, j, j + 1);
                }
            }
        }
        return numbers;

    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assert output.equals(sort(input));
    }
}
