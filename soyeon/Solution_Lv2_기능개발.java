package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_Lv2_기능개발 {
	public int[] solution(int[] progresses, int[] speeds) {
		ArrayList<Integer> al = new ArrayList<>();
		int[] nArr = new int[100];// 남은 일수 배열
		int max = Integer.MIN_VALUE; // 일수중에 가장 큰 값
		int n = 0; // 며칠만에 끝날 수 있는지

		for (int i = 0; i < progresses.length; i++) {
			int nDay = 100 - progresses[i]; // 남은 일수
			if (nDay % speeds[i] != 0) { // 남은 일수에서 speeds를 나눴을 때 나누어 떨어지지 않는다면
				n = nDay / speeds[i] + 1; // +1을 하여 n에 넣기
			} else {
				n = nDay / speeds[i];
			}

			if (n < max) { // 일수보다 max값이 크다면
				nArr[max]++;
			} else {
				nArr[n]++;
				max = n; // max값을 이전 일수 중 가장 큰 값
			}
		}

		System.out.println(Arrays.toString(nArr));

		for (int i = 0; i < nArr.length; i++) {
			if (nArr[i] > 0) {
				al.add(nArr[i]);
			}
		}

		int[] answer = new int[al.size()];
		for (int i = 0; i < al.size(); i++) {
			answer[i] = al.get(i);
		}
		return answer;
	}
}
