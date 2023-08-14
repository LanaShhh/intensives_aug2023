package ru.yandex.tasks;

import javax.swing.text.StyleContext;
import java.util.ArrayList;
import java.util.Arrays;

public class Task1BubbleSort {

    public static void main(String[] args) {
        selfCheck();
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой пузырьком!) numbers
         */
        for (int maxSize = numbers.size(); maxSize > 0; maxSize--) {
            for (int i = 0; i < maxSize; i++) {
                if (i + 1 < maxSize && numbers.get(i + 1) < numbers.get(i)) {
                    int buffer = numbers.get(i + 1);
                    numbers.set(i + 1, numbers.get(i));
                    numbers.set(i, buffer);
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
