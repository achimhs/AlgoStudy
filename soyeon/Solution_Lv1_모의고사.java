package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_Lv1_모의고사 {
	public int[] solution(int[] answers) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] arr3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int[] answer = new int[3]; // 3명의 수포자

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == arr1[i % arr1.length])
				answer[0]++;
			if (answers[i] == arr2[i % arr2.length])
				answer[1]++;
			if (answers[i] == arr3[i % arr3.length])
				answer[2]++;
		}
		int max = Math.max(answer[0], Math.max(answer[1], answer[2]));
		ArrayList<Integer> al = new ArrayList<>();
		// 궁금한점: 동점이면 max했을 때 다 max로 인식되나?
		if (max == answer[0]) {
			al.add(1);
		}
		if (max == answer[1]) {
			al.add(2);
		}
		if (max == answer[2]) {
			al.add(3);
		}
		int[] result = new int[al.size()];
		// System.out.println(Arrays.toString(answer));
		for (int i = 0; i < al.size(); i++) {
			result[i] = al.get(i);
		}
		Arrays.sort(result);
		return result;
	}
}