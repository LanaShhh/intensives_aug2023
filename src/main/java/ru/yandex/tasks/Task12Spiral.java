package ru.yandex.tasks;

import java.util.Arrays;

public class Task12Spiral {
    public static int[][] draw (int N) {
        /*
         * Отрисовывает "спираль" в двумерном массиве по часовой стрелке
         * -10^3 <= N <= 10^3
         * Выход: массив со спиралью
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        int[][] spiral = new int[N][N];
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                spiral[i][j] = 0;
            }
        }
        int i = 0, j = 0;
        int value = 1;
        spiral[i][j] = value++;
        while (value <= N * N) {
            while (j + 1 < N && spiral[i][j+1] == 0) {
                spiral[i][j+1] = value++;
                j++;
            }
            while (i + 1 < N && spiral[i+1][j] == 0) {
                spiral[i+1][j] = value++;
                i++;
            }
            while (j - 1 >= 0 && spiral[i][j-1] == 0) {
                spiral[i][j-1] = value++;
                j--;
            }
            while (i - 1 >= 0 && spiral[i-1][j] == 0) {
                spiral[i-1][j] = value++;
                i--;
            }
        }
        return spiral;
    }

    public static void selfCheck() {
        int[][] output = {
                {1, 2, 3, 4, 5, 6, 7},
                {24, 25, 26, 27, 28, 29, 8},
                {23, 40, 41, 42, 43, 30, 9},
                {22, 39, 48, 49, 44, 31, 10},
                {21, 38, 47, 46, 45, 32, 11},
                {20, 37, 36, 35, 34, 33, 12},
                {19, 18, 17, 16, 15, 14, 13}
        };

        assert Arrays.deepEquals(output, draw(7));
    }
}
