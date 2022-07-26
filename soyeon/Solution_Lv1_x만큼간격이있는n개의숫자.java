package programmers;

public class Solution_Lv1_x만큼간격이있는n개의숫자 {
	/*
	 * x을 num으로 바꾸고 long으로 해줘야함
	 * 규칙을 모르겠다면 i를 바꿔보는 방법도 괜찮
	 */
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		long num = x;
		for (int i = 1; i <= n; i++) {
			answer[i - 1] = num * i;
		}
		return answer;
	}
}
