package programmers;

import java.util.ArrayList;

public class Solution_Lv1_나누어떨어지는숫자배열 {
	/*
	 * Integer와 int차이..?
	 * 리스트를 배열로 바꾸는 법: al.toArray(new Integer[al.size()]);
	 */
	public Integer[] solution(int[] arr, int divisor) {
		int[] answer = {};
		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				al.add(arr[i]);
			}
		}
		return al.toArray(new Integer[al.size()]);
	}
}