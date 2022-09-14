package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_Lv1_나누어떨어지는숫자배열 {
	public int[] solution(int[] arr, int divisor) {
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				al.add(arr[i]);
			}
		}

		int[] answer = new int[al.size()];
		int[] answer2 = { -1 };
		if (al.size() > 0) {
			for (int i = 0; i < al.size(); i++) {
				answer[i] = al.get(i);
			}
			Arrays.sort(answer);
			return answer;
		} else {
			return answer2;
		}
	}

//	public static void main(String[] args) {
//		Divisible div = new Divisible();
//		int[] array = { 5, 9, 7, 10 };
//		System.out.println(Arrays.toString(div.divisible(array, 5)));
//	}
}