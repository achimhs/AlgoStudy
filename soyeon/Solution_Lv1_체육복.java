package programmers;

import java.util.Arrays;

public class Solution_Lv1_체육복 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {// 일단 전체 +1씩
			arr[i]++;
		}

		for (int i = 0; i < lost.length; i++) { // 잃어버린 사람 빼주기
			int lostN = lost[i];
			arr[lostN - 1]--;
		}

		for (int i = 0; i < reserve.length; i++) {
			int reserveN = reserve[i];
			if (reserveN == 1) {
				arr[1]++;
			} else if (reserveN == n) {
				arr[n - 2]++;
			} else {
				arr[reserveN - 2]++;
				arr[reserveN]++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(answer);

		for (int i = 0; i < reserve.length; i++) {
			int reserveN = reserve[i];
			if (reserveN == 1) {
				if (arr[1] == 2) {
					arr[1] = 1;
				} else if (arr[1] == 1) {
					arr[1] = 0;
				}
			} else if (reserveN == n) {
				if (arr[reserveN - 2] > 1) {
					arr[reserveN - 2] = 1;
				}
			} else {
				if (arr[reserveN - 2] == 1 && arr[reserveN] == 1) {
					arr[reserveN - 2] = 1;
					arr[reserveN] = 0;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 1) {
				answer += 1;
			}
		}
		return answer;
	}
}