package programmers;

public class Solution_Lv1_정수제곱근판별 {
	/*
	 * double과 Double의 차이
	 * intValue()
	 * long으로 바꿔주는 거
	 */
	public long solution(long n) {
		long answer = 0;
		Double x = Math.sqrt(n);

		if (x == x.intValue()) {
			answer = (long) Math.pow(x + 1, 2);
		} else {
			answer = -1;
		}
		return answer;
	}
}