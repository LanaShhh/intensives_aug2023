// Extra task https://leetcode.com/problems/sort-vowels-in-a-string/

package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1BubbleSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой пузырьком!) numbers
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        boolean isSwapped;
        for (int i = 0; i < numbers.size() - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < numbers.size() - i - 1; j++) {
                int a = numbers.get(j);
                int b = numbers.get(j + 1);
                if (a > b) {
                    numbers.set(j, b);
                    numbers.set(j + 1, a);
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
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
