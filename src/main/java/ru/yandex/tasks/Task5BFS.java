package ru.yandex.tasks;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Task5BFS {
	public static void runSearch(List<Integer> result, int[][] tree, int root) {
		/*
		 * Реализация bfs
		 */
		// (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
		Queue<Integer> q = new ArrayDeque<>();
		q.add(root);

		while (!q.isEmpty()) {
			int cur = q.poll();
			result.add(cur);
			if (tree[cur][0] != -1) {
				q.add(tree[cur][0]);
			}
			if (tree[cur][1] != -1) {
				q.add(tree[cur][1]);
			}
		}
	}

	public static int[] getBFSOrder(int[][] tree, int root) {
		/*
		 * Функция возвращает массив с порядковыми номерами вершин в обходе
		 * Дано дерево из n (<= 10^5) вершин (пронумерованных от 0 до n-1)
		 * tree - двумерный массив, tree[i][0] - номер левого сына, tree[i][1] - номер правого сына (если нет левого / правого сына, соотв. элемент -1).
		 * root - корень, откуда нужно начинать обход
		 */
		// (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
		List<Integer> result = new ArrayList<>();
		runSearch(result, tree, root);
		return result.stream().mapToInt(i -> i).toArray();
	}

	public static void selfCheck() {
		int[][] tree =
				{
						{1, 6},
						{2, 3},
						{-1, -1},
						{4, -1},
						{-1, -1},
						{-1, -1},
						{-1, 8},
						{-1, -1},
						{-1, -1}
				};

		int[] ans1 = {0, 1, 6, 2, 3, 8, 4};
		int[] ans2 = {3, 4};
		int[] ans3 = {2};
		int[] ans4 = {6, 8};

		assert (Arrays.equals(getBFSOrder(tree, 0), ans1));
		assert (Arrays.equals(getBFSOrder(tree, 3), ans2));
		assert (Arrays.equals(getBFSOrder(tree, 2), ans3));
		assert (Arrays.equals(getBFSOrder(tree, 6), ans4));
	}
}
