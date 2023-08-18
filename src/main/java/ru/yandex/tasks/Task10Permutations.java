package ru.yandex.tasks;

import java.util.*;

public class Task10Permutations {

    private static List<List<Integer>> permutations = new ArrayList<>();

    public static int[][] permutations(int[] numbers) {
        /*
         * Возвращает массив со всеми перестановками массива numbers (массив n чисел от 1 до n, 1 <= n <= 10)
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        calc(numbers, new ArrayList<>(), new HashSet<>());
        int[][] res = new int[permutations.size()][numbers.length];
        for (int i = 0; i < permutations.size(); i++) {
            for (int j = 0; j < permutations.get(i).size(); j++) {
                res[i][j] = permutations.get(i).get(j);
            }
        }
        return res;
    }

    private static void calc(int[] numbers, List<Integer> result, Set<Integer> indexes) {
        if (result.size() == numbers.length) {
            permutations.add(result);
            return;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (!indexes.contains(i)) {
                HashSet<Integer> tmpIndexes = new HashSet<>(indexes);
                ArrayList<Integer> tmpResult = new ArrayList<>(result);
                tmpResult.add(numbers[i]);
                tmpIndexes.add(i);
                calc(numbers, tmpResult, tmpIndexes);
            }
        }
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
