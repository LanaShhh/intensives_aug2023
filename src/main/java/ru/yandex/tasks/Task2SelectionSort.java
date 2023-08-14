package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2SelectionSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int smallest = numbers.get(i);
            int smallestIndex = i;
            for (int j = i; j < numbers.size(); j++) {
                int value = numbers.get(j);
                if (value < smallest) {
                    smallest = value;
                    smallestIndex = j;
                }
            }

            if (smallestIndex != i) {
                int head = numbers.get(i);
                numbers.set(i, smallest);
                numbers.set(smallestIndex, head);
            }
        }

        System.out.println(numbers);
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой выбором!) numbers
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        return null;
    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assert output.equals(sort(input));
    }

    public static void main(String[] args) {
        sort(new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1)));
        selfCheck();
    }
}
