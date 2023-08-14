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
        if (numbers.size() < 1) return numbers;

        for (int i = 0; i < numbers.size(); i ++) {
            boolean isSwapped = false;
            for (int j = 0; j < numbers.size() - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    isSwapped = true;
                    swap(numbers, j, j + 1);
                }
            }
            if (!isSwapped) return numbers;
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

    public static void main(String[] args) {
        selfCheck();
    }
}
