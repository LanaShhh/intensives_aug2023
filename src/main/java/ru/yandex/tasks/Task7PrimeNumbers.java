package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7PrimeNumbers {
	public static int[] findPrimes(int N) {
		/*
		 * 2 <= N <= 10^6
		 * Выход: отсортированный массив всех простых чисел от 2 до N
		 */
		// (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
		List<Integer> result = new ArrayList<>();
		int[] arr = new int[N];
		for (int i = 1; i < Math.sqrt(N); i++) {
			for (int j = (i + 1) * (i + 1); j <= arr.length; j++) {
				if (j % (i + 1) == 0) {
					arr[j - 1] = -1;
				}
			}
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == -1)
				continue;
			result.add(i + 1);
		}

		return result.stream().mapToInt(i -> i).toArray();
	}

	public static void selfCheck() {
		int[] output = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};

		assert (Arrays.equals(output, findPrimes(35)));
	}
}
