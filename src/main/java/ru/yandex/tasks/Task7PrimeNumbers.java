package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7PrimeNumbers {
    private static final List<Integer> primes = new ArrayList<>();
    public static int[] findPrimes (int N) {
        /*
         * 2 <= N <= 10^6
         * Выход: отсортированный массив всех простых чисел от 2 до N
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        primes.add(2);
        start:
        for (int i = 3; i <= N; i++) {
            for (int div : primes) {
                if (i % div == 0 || div > Math.sqrt(i) + 1) break start;
            }
            primes.add(i);
        }
        int[] ans = new int[primes.size()];
        for (int i = 0; i < primes.size(); i++) {
            ans[i] = primes.get(i);
        }
        return ans;
    }

    public static void selfCheck() {
        int[] output = {2, 3, 5};

        assert (Arrays.equals(output, findPrimes(5)));
    }

    public static void main(String[] args) {
        selfCheck();
    }
}
