package programmers;

import java.util.Arrays;

public class Solution_Lv2_HIndex {
	/*
	 * 편 vs 번 : count를 하고 n편이상 == n편이하 : 그래서 처음에 틀림 
	 * 처음 배열을 바꿔버려서 h가 올라갈 때마다 -1 배열이 그대로 됨(항상 temp배열을 만드는 연습)
	 */
	public int solution(int[] citations) {
		int answer = 0;
		int count;
		boolean flag = false;
		int n = citations.length;// 논문 n편

		Arrays.sort(citations); // 0 1 3 5 6

		for (int h = 1; h <= 10000; h++) {// 논문별 인용 횟수는 0회 이상 10,000회 이하입니다.
			count = 0;
			flag = false;
			int[] temp = new int[n];// flag를 둘 배열 생성
			// answer=0; 을 하면 안됨 : answer을 최댓값을 구해야 하니까

			for (int i = 0; i < n; i++) {
				if (citations[i] >= h) {
					count++; // 편의 개수를 구함
					temp[i] = -1;
				}
			}

			for (int i = 0; i < n; i++) {
				if (temp[i] != -1) {// 나머지 논문중에서
					if (citations[i] >= h) { // 나머지 논문이 h번 이하이면 되니까
						flag = true;
						break;
					}
				}
			}
			if (flag == false && count >= h) { // h번 이상 인용된 논문이 h'편' 이상이고 나머지 논문이 h'번' 이하 인용되었다면
				answer = h;
			}
		}
		return answer;
	}
}
// 나의 오답 : 문제 잘못 인지
//		int answer = 0;
//		int count = 0;
//
//		for (int i = 1; i <= 1000; i++) {
//			count = 0;
//			for (int j = 0; j < citations.length; j++) {
//				if (citations[j] >= i) {
//					count++;
//				}
//				if (citations[j] <= i) {
//					count--;
//				}
//			}
//			if (count == 0) {
//				answer = i;
//				break;
//			}
//		}
//		return answer;
//	}
//}
