package programmers;

import java.util.Arrays;

public class Solution_Lv2_최댓값과최솟값 {
	/*
	 * '공백'과 '-'로 분리되어 있는 줄
	 * string배열 -> int배열 -> sort -> 배열의 0번째와 끝번째
	 * sb와 st를 썼으면 더 좋았을 문제
	 */
	public String solution(String s) {

		String[] strArr = s.split(" "); // 공백으로 분리
		int[] arr = new int[strArr.length]; // sort하기 위해 int배열을 만듦, string을 sort했더니 이상하게 됨
		for (int i = 0; i < arr.length; i++) {
			// arr[i] = s.charAt(i)-'0'; //s엔 공백이나 -분리가 안되어 있어서 탈락
			arr[i] = Integer.parseInt(strArr[i]);
		}

		Arrays.sort(arr);

		String min = arr[0] + "";
		String max = arr[arr.length - 1] + "";

		String answer = min + " " + max;
		return answer;
	}
}