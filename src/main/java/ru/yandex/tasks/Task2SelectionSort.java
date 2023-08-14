package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2SelectionSort {

    public static void main(String[] args) {
        selfCheck();
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой выбором!) numbers
         */
        for (int maxSize = numbers.size(); maxSize > 0; maxSize--) {
            int maxIndex = 0;
            for (int i = 0; i < maxSize; i++) {
                if (numbers.get(maxIndex) < numbers.get(i)) {
                    maxIndex = i;
                }
            }
            Integer buffer = numbers.get(maxSize - 1);
            numbers.set(maxSize - 1, numbers.get(maxIndex));
            numbers.set(maxIndex, buffer);
        }
        return numbers;
    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assert output.equals(sort(input));
    }
}
