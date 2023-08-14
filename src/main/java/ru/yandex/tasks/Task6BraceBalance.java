package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Task6BraceBalance {
    public static boolean checkBalance(String sequence) {
        /*
         * sequence - последовательность скобок []{}() длины до 10^5
         * Выход: true/false, является ли строка ПСП
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
        Stack<Character> stack = new Stack<>();
        for (Character c : sequence.toCharArray()) {
            if (stack.isEmpty()) {
                stack.add(c);
                continue;
            }
            if (stack.peek().equals('(') && c.equals(')')
                    || stack.peek().equals('{') && c.equals('}')
                    || stack.peek().equals('[') && c.equals(']')
            ) {
                stack.pop();
            }
            else {
                stack.add(c);
            }
        }
        return stack.isEmpty();
    }

    public static void selfCheck() {
        String test1 = "[({})]{[]}";
        String test2 = "{({})}{";

        assert checkBalance(test1);
        assert !checkBalance(test2);
    }
}
