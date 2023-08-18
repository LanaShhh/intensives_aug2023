// Extra task https://leetcode.com/problems/prime-in-diagonal/

package ru.yandex.tasks;

import java.util.Arrays;

public class Task7PrimeNumbers {
    public static int[] findPrimes (int N) {
        /*
         * 2 <= N <= 10^6
         * Выход: отсортированный массив всех простых чисел от 2 до N
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        boolean[] isSimple = new boolean[N + 2];
        Arrays.fill(isSimple, true);
        int resLen = 0;
        for (int i = 2; i  < N + 2; i++) {
            if (isSimple[i]) {
                resLen++;
                for (int j = 2; i * j < N + 2; j++) {
                    isSimple[j * i] = false;
                }
            }
        }
        int[] res = new int[resLen];
        int pointer = 0;
        for (int i = 2; i < N + 2; i++) {
            if (isSimple[i]) {
                res[pointer++] = i;
            }
        }
        return res;
    }

    public static void selfCheck() {
        int[] output = {2, 3, 5};

        assert (Arrays.equals(output, findPrimes(5)));
    }
}
