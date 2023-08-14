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
        for (int i = 0; i < numbers.size(); i++) {
            int minIndex = 0;
            int minValue = Integer.MAX_VALUE;
            for (int j = i; j < numbers.size(); j++) {
                if (numbers.get(j) < minValue) {
                    minValue = numbers.get(j);
                    minIndex = j;
                }
            }
            swap(numbers, i, minIndex);
        }
        System.out.println(numbers);
        return numbers;
    }

    private static void swap(ArrayList<Integer> nums, int indexFrom, int indexTo) {
        Integer tmp = nums.get(indexFrom);
        nums.set(indexFrom, nums.get(indexTo));
        nums.set(indexTo, tmp);
    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assert output.equals(sort(input));
    }
}
