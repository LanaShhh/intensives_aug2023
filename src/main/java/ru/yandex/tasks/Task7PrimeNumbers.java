package ru.yandex.tasks;

import java.util.Arrays;

public class Task7PrimeNumbers {
    public static int[] findPrimes (int N) {
        /*
         * 2 <= N <= 10^6
         * Выход: отсортированный массив всех простых чисел от 2 до N
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        int[] isPrime = new int[N + 1];
        for (int i = 0; i <= N; ++i) {
            isPrime[i] = 1;
        }
        int primeCount = 0;
        for (int i = 2; i <= N; ++i) {
            if (isPrime[i] == 0) {
                continue;
            }
            primeCount++;
            if ((long)i * i > N)
                continue;

            for (int j = i * i; j <= N; j += i) {
                isPrime[j] = 0;
            }
        }
        int[] primeNumbers = new int[primeCount];
        int pointer = 0;
        for (int i = 2; i <= N; ++i) {
            if (isPrime[i] == 1) {
                primeNumbers[pointer++] = i;
            }
        }
        return primeNumbers;
    }

    public static void selfCheck() {
        int[] output = {2, 3, 5};

        assert (Arrays.equals(output, findPrimes(5)));
    }
}
