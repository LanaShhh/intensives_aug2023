package ru.yandex.tasks;

import java.util.Stack;

public class Task6BraceBalance {

	public static Character getPair(Character bracket) {
		return switch (bracket) {
			case '}' -> '{';
			case ')' -> '(';
			case ']' -> '[';
			default -> '-';
		};
	}


	public static boolean checkBalance(String sequence) {
		/*
		 * sequence - последовательность скобок []{}() длины до 10^5
		 * Выход: true/false, является ли строка ПСП
		 */
		// (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧
		Stack<Character> stack = new Stack<>();
		for (char ch : sequence.toCharArray()) {
			if (ch == '[' || ch == '(' || ch == '{') {
				stack.push(ch);
			} else if (stack.pop() != getPair(ch)) {
				return false;
			}
		}

		return stack.empty();
	}

	public static void selfCheck() {
		String test1 = "[({})]{[]}";
		String test2 = "{({})}{";

		assert checkBalance(test1);
		assert !checkBalance(test2);
	}
}
