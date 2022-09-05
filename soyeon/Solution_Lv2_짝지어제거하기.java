package programmers;

import java.util.Stack;

public class Solution_Lv2_짝지어제거하기 {
	/*
	 * 넣어놓고 시작하면 왜 오류가 날까? -> 하다가 중간에 스택이 비워지면 푸시를 해줘야하는데!!!
	 */
	class Solution {
		public int solution(String s) {
			Stack<Character> stack = new Stack<>();
			int answer = 0;

			stack.push(s.charAt(0));

			for (int i = 1; i < s.length(); i++) {
				if (stack.isEmpty() || stack.peek() != s.charAt(i)) {
					stack.push(s.charAt(i));
				} else {
					stack.pop();
				}
			}

			if (stack.size() == 0) {
				answer = 1;
			}

			return answer;
		}
	}
}