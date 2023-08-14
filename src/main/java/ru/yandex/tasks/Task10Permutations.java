package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task10Permutations {
    private static int[] cur;
    private static int pos;

    public static int generate(int[] numbers, int[] used, int[][] answer, int posInAnswer) {
        if (pos == numbers.length) {
            answer[posInAnswer] = Arrays.copyOf(cur, pos);
            return posInAnswer;
        }
        for (int i = 0; i < numbers.length; ++i) {
            if (used[i] == 0) {
                used[i] = 1;
                cur[pos] = numbers[i];
                pos++;
                posInAnswer = generate(numbers, used, answer, posInAnswer) + 1;
                pos--;
                used[i] = 0;
            }
        }
        return posInAnswer;
    }
    public static int[][] permutations(int[] numbers) {
        /*
         * Возвращает массив со всеми перестановками массива numbers (до 10 элементов, все по модулю до 10^5)
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        int nFact = 1;
        for (int i = 1; i <= numbers.length; ++i) {
            nFact *= i;
        }
        int[][] answer = new int[nFact][];
        cur = new int[numbers.length];
        pos = 0;
        generate(numbers, new int[numbers.length], answer, 0);
        return answer;
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
        int[][] res = permutations(input);
        assert Arrays.deepEquals(output, permutations(input));
    }
}
