package ru.yandex.tasks;

public class Task11BiggestSubarraySum {

    public static Subarray find(int[] numbers) {
        /*
         * Находит подмассив (подряд идущие элементы массива) с наибольшей суммой элементов
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: Subarray
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        int minSum = 0;
        int pos = -1;
        int sum = 0;
        int ans = numbers[0];
        Subarray ansBorder = new Subarray();
        ansBorder.left = 0;
        ansBorder.right = 0;
        for (int i = 0; i < numbers.length; ++i) {
            sum += numbers[i];
            if (sum - minSum > ans) {
                ansBorder.left = pos + 1;
                ansBorder.right = i + 1;
                ans = sum - minSum;
            }
            if (sum < minSum) {
                minSum = sum;
                pos = i;
            }
        }
        return ansBorder;
    }

    public static void selfCheck() {
        int[] output = {1, 2, -5, 7, -1, 6};
        Subarray ans = find(output);

        assert ans != null;
        assert (ans.left == 3 && ans.right == 6);
    }
}
