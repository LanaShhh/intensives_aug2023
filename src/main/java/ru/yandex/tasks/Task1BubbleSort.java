package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1BubbleSort {

    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            boolean isSwapped = false;
            for (int j = 0; j < numbers.size() - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    isSwapped = true;
                    swap(numbers, j, j + 1);
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        return numbers;
    }

    private static void swap(ArrayList<Integer> numbers, int first, int second) {
        int temp = numbers.get(first);
        numbers.set(first, numbers.get(second));
        numbers.set(second, temp);
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
