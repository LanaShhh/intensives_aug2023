package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3InsertionSort {
    public static void main(String[] args) {
        selfCheck();
    }
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой вставками!) numbers
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        for (int i = 0; i < numbers.size(); i++) {
            int min = numbers.get(i);
            int min_i = i;
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(j) < min) {
                    min = numbers.get(j);
                    min_i = j;
                }
            }
            int temp = numbers.get(i);
            numbers.set(i, min);
            numbers.set(min_i, temp);
        }
        return numbers;
    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assert output.equals(sort(input));
    }
}
