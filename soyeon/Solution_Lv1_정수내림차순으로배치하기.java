package programmers;

import java.util.Arrays;

public class Solution_Lv1_정수내림차순으로배치하기 {
	/*
	 * 대분류: 숫자 -> 배열 -> 숫자 
	 * 중분류: 
	 * 소분류: 
	 * 포인트1: 'String[] arr'은 ns가 문자열이면,'ns.split("")'로 바로 배열 가능/그게 아니라서 new long[]해줘야 함
	 * 포인트2: 문자열은 계속 + 가능하니까 숫자를 문자열로 넣어놓고 마지막에 Long으로 바꾸기
	 */
	public long solution(long n) {
		String ns = n + "";
		long[] arr = new long[ns.length()];

		for (int i = 0; i < ns.length(); i++) {
			arr[i] = ns.charAt(i) - '0';
		}

		Arrays.sort(arr);

		String answer = "";
		for (int i = 0; i < ns.length(); i++) {
			answer += arr[arr.length - i - 1];
		}

		return Long.parseLong(answer);
	}
}