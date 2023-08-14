package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task13MergeSort {
    public static List<Integer> sort(List<Integer> numbers) {
        if (numbers.size() <= 1) {
            return numbers;
        }
        int mid = numbers.size() / 2;
        List<Integer> leftPart = List.copyOf(sort(numbers.subList(0, mid)));
        List<Integer> rightPart = List.copyOf(sort(numbers.subList(mid, numbers.size())));
        int pos1 = 0, pos2 = 0;
        while (pos1 < leftPart.size() && pos2 < rightPart.size()) {
            if (leftPart.get(pos1) <= rightPart.get(pos2)) {
                numbers.set(pos1 + pos2, leftPart.get(pos1++));
            }
            else {
                numbers.set(pos1 + pos2, rightPart.get(pos2++));
            }
        }
        while (pos1 < leftPart.size()) {
            numbers.set(pos1 + pos2, leftPart.get(pos1++));
        }
        while (pos2 < rightPart.size()) {
            numbers.set(pos1 + pos2, rightPart.get(pos2++));
        }
        return numbers;
    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assert output.equals(sort(input));
    }
}
