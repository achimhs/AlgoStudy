package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class Solution_Lv1_제일작은수제거하기 {
	public int[] solution(int[] arr) {
		int[] temp = new int[arr.length];// 임시배열 만듦
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		Arrays.sort(temp);
		int min = temp[0];// 배열중에서 가장 작은 값

		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != min) {// arraylist에 제일 작은 수를 제거하고 순서대로 넣음
				al.add(arr[i]);
			}
		}

		// al를 배열로 만드는 작업
		int[] answer = new int[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++) {
			answer[i] = al.get(i);
		}

		int[] answer2 = { -1 };

		if (answer.length > 0) {
			return answer;
		} else {
			return answer2;
		}
	}
}