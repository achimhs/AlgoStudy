package programmers;

import java.util.Arrays;

public class Solution_Lv1_문자열내림차순으로배치하기 {
	/*
	 * 처음에 어렵게 생각: 대문자와 소문자가 같이 sort되는지 몰랐고
	 */
	public String solution(String s) {
		String answer = "";
		String[] arr = s.split("");

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			answer += arr[arr.length - i - 1];
		}
		return answer;
	}
}