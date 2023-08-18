// Extra task https://leetcode.com/problems/valid-parentheses/

package ru.yandex.tasks;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task6BraceBalance {
    public static boolean checkBalance(String sequence) {
        /*
         * sequence - последовательность скобок []{}() длины до 10^5
         * Выход: true/false, является ли строка ПСП
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        Deque<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < sequence.length(); i++) {
            char c = sequence.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                queue.addLast(c);
            } else  {
                if (queue.isEmpty()) {
                    return false;
                }
                switch (c) {
                    case ']' -> {if (queue.peekLast() != '[') return false;}
                    case '}' -> {if (queue.peekLast() != '{') return false;}
                    case ')' -> {if (queue.peekLast() != '(') return false;}
                }
                queue.pollLast();
            }

        }
        return queue.isEmpty();
    }

    public static void selfCheck() {
        String test1 = "[({})]{[]}";
        String test2 = "{({})}{";

        assert checkBalance(test1);
        assert !checkBalance(test2);
    }
}
