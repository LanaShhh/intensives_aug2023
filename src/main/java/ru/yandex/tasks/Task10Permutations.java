package ru.yandex.tasks;

import java.util.Arrays;

public class Task10Permutations {
    public static int[][] permutations(int[] numbers) {
        /*
         * Возвращает массив со всеми перестановками массива numbers (массив n чисел от 1 до n, 1 <= n <= 10)
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        return null;
    }

    public static void selfCheck() {
        int[] input = {1, 2, 3};
        int[][] output = {
                {1, 2, 3},
                {1, 3, 2},
                {2, 1, 3},
                {2, 3, 1},
                {3, 1, 2},
                {3, 2, 1}
        };

        assert Arrays.deepEquals(output, permutations(input));
    }
}
