package programmers;

import java.util.Stack;

public class Solution_Lv2_올바른괄호 {

	static String s = "()()";

	boolean solution(String s) {
		boolean answer = true;

		Stack<String> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push("(");
			} else {
				if (stack.isEmpty()) {
					answer = false;
					break;
				} else {
					stack.pop();
				}
			}
		}
		if (stack.size() > 0) {
			answer = false;
		}
		return answer;
	}
}