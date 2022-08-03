package programmers;

import java.util.Arrays;

public class Solution_Lv1_체육복 {
	public int solution(int n, int[] lost, int[] reserve) {
		int[] all = new int[n];
		int count = n - lost.length;// 일단 가져온 사람 수를 count한다

		for (int i = 0; i < n; i++) {
			all[i]++;// 일단 전체 값 넣어주기
		}
		for (int i = 0; i < lost.length; i++) {
			all[lost[i] - 1]--; // 안가져온 학생 빼주기
		}
		System.out.println(Arrays.toString(all));

		for (int i = 0; i < reserve.length; i++) {
			if (reserve[i] == 1) { // 가져온 사람이 1번일 경우 0번은 없으니까 2번한테만 count
				all[1]++;
				continue;
			}
			if (reserve[i] == n) { // 가져온 사람이 n번일 경우 배열의 범위에서 벗어나므로 그 아래만 count
				all[n - 1]++;
				continue;
			}
			all[reserve[i] - 2]++; // 양쪽 +1씩 해주기
			all[reserve[i]]++;

			if (all[reserve[i] - 2] == 1 && all[reserve[i]] == 1) { // 만약 reserve에서 양쪽 +1 해준 게 하나만 체육복을 가져오기
				count++;
			} else {
				count += 2;
			}
		}
		System.out.println(Arrays.toString(all));
		return count;
	}
}
