package programmers;

public class Solution_Lv2_피보나치수 {
	/*
	 * 방법1: 시간초과 (41점)
	 * 방법2: 1234567로 나눔 (42.9점)
	 * 방법3: '배열'과 '반복문'으로 풀길래 그걸로 풀음
	 * 문제에서 2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요. 잊지말자
	 */
	public int solution(int n) {
		int[] answer = new int[n + 1];

		for (int i = 0; i <= n; i++) {
			if (i == 0) {
				answer[i] = 0;
			} else if (i == 1) {
				answer[i] = 1;
			} else {
				int sum = answer[i - 2] + answer[i - 1];
				answer[i] = sum % 1234567;
			}
		}
		return answer[n];
	}
}
//
//		int answer = 0;
//		answer = fibo(n);
//
//		return answer;
//	}
//
//	static int fibo(int n) {
//		if (n == 0) {
//			return 0;
//		} else if (n == 1) {
//			return 1;
//		} else {
//			return (fibo(n - 1) + fibo(n - 2)) % 1234567;
//		}
//	}
//}