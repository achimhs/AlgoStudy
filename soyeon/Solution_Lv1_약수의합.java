package programmers;

public class Solution_Lv1_약수의합 {
	/*
	 * 약수: 1부터 n까지 n으로 나누어 떨어지는 수
	 */
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer += i;
			}
		}
		return answer;
	}
}