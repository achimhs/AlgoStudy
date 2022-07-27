package programmers;

import java.util.Stack;

public class Solution_Lv1_같은숫자는싫어 {
	/*
	 * 틀린 이유1: 스택이 비어있을 때 처리를  stack.peek()!=arr[i] 이것보다 먼저 해줘야 함
	 * 틀린 이유2: 스택에서 pop을 하고 배열에 넣을 때 i--부분(차라리 get(i)가 나을지도)
	 * 틀린 이유3: answer의 배열의 크기를 다시 설정해줘야 함
	 * 알게된 점: push(i), pop(), peek(), isEmpty(), get(i)도 쓰인다!!
	 */
	public int[] solution(int[] arr) {
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < arr.length; i++) {
			if (stack.size() == 0 || stack.peek() != arr[i]) {
				stack.push(arr[i]);
			}
		}

		int[] answer = new int[stack.size()];
		for (int i = stack.size() - 1; i >= 0; i--) {
			answer[i] = stack.pop();
		}
		return answer;
	}
}