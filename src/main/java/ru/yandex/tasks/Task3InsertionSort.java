// Extra task https://leetcode.com/problems/find-the-value-of-the-partition/

package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3InsertionSort {
    public static ArrayList<Integer> sort(ArrayList<Integer> numbers) {
        /*
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: отсортированный (сортировкой вставками!) numbers
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
//        ArrayList<Integer> sortedNumbers = new ArrayList<>(Collections.nCopies(numbers.size(), Integer.MAX_VALUE));
        for (int i = 0; i < numbers.size(); i++) {
            int el = numbers.get(i);
            int insertInd = i;
            for (int j = 0; j <= i; j++) {
                if (el < numbers.get(j)) {
                    insertInd = j;
                    break;
                }
            }
            for (int j = i; j > insertInd; j--) {
                numbers.set(j, numbers.get(j - 1));
            }
            numbers.set(insertInd, el);
        }
        return numbers;
    }

    public static void selfCheck() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 1));
        ArrayList<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        assert output.equals(sort(input));

        ArrayList<Integer> input2 = new ArrayList<>(Arrays.asList(2, 1));
        ArrayList<Integer> output2 = new ArrayList<>(Arrays.asList(1, 2));

        assert output2.equals(sort(input2));


        ArrayList<Integer> input3 = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1, 0));
        ArrayList<Integer> output3 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));

        assert output3.equals(sort(input3));
    }
}
