// Extra task https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package ru.yandex.tasks;

public class Task8BinarySearch {
    public static int find(int number, int[] sortedList) {
        /*
         * number: целое число, -10^5 <= number <= 10^5
         * numbers: массив целых чисел, 0 <= numbers.length <= 10^5
         * Выход: i, где numbers[i] = number, -1, если такого i нет
         * Если таких i несколько, вывести наибольший
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        int l = 0;
        int r = sortedList.length ;
        while (l < r - 1) {
            int m = (l + r) / 2;
            if (sortedList[m] <= number) {
                l = m;
            } else {
                r = m;
            }
        }
        return sortedList[l] == number ? l : -1;
    }

    public static void selfCheck() {
        int[] input = {1, 3, 5, 7, 9};

        for (int i = 0; i < input.length; i++) {
            assert (find(input[i], input) == i);
        }

        assert (find(3, new int[]{1, 2, 3, 3, 3}) == 4);
        assert (find(3, new int[]{1, 2, 3, 3, 3, 5}) == 4);
        assert (find(3, new int[]{3, 3, 5}) == 1);
    }
}
