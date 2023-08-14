package ru.yandex.tasks;

import java.util.Arrays;

public class Task12Spiral {
	public static int[][] draw(int N) {
		/*
		 * Отрисовывает "спираль" в двумерном массиве по часовой стрелке
		 * -10^3 <= N <= 10^3
		 * Выход: массив со спиралью
		 */
		// (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
		int[][] matrix = new int[N][N];
		int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
		int i = 0, j = 0, d = 0, cur = 1;
		while (cur <= N * N) {
			matrix[i][j] = cur++;
			if (i + dir[d][0] == N || i + dir[d][0] == -1 || j + dir[d][1] == -1
					|| j + dir[d][1] == N || matrix[i + dir[d][0]][j + dir[d][1]] != 0) {
				d = (d + 1) % 4;
			}
			i += dir[d][0];
			j += dir[d][1];
		}

		return null;
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
