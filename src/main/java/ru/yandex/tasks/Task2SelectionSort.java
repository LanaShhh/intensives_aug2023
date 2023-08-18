// Extra task https://leetcode.com/problems/minimum-index-of-a-valid-split/

package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2SelectionSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой выбором!) numbers
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        for (int i = 0; i < numbers.size() - 1; i++) {
            int minInd = i;
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(j) < numbers.get(minInd)) {
                    minInd = j;
                }
            }
            int a = numbers.get(i);
            int b = numbers.get(minInd);
            if (a > b) {
                numbers.set(i, b);
                numbers.set(minInd, a);
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
