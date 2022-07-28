package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_Lv1_K번째수 {
	/*
	 * arrayList에서 배열로 바꾸는 방법 모르겠음
	 * 그냥 크게 반복문 1개 돌렸으면 됨
	 */
	static int i, j, k;
	static int[] temp;

	public int[] solution(int[] array, int[][] commands) {
		ArrayList<Integer> al = new ArrayList<>();

		for (int r = 0; r < commands.length; r++) {
			for (int c = 0; c < commands[0].length; c++) {
				i = commands[r][0]; // i번부터
				j = commands[r][1]; // j번까지
				k = commands[r][2]; // k번째
				temp = new int[j - i + 1];
			}
			int idx = 0;
			for (int t = i; t <= j; t++) {
				temp[idx] += array[t - 1];
				idx++;
			}
			Arrays.sort(temp); // 정렬
			
			al.add(temp[k - 1]);
		}
		int[] answer = new int[commands.length];
		for (int i = 0; i < al.size(); i++) {
			answer[i] += al.get(i);
		}
		return answer;
	}
}