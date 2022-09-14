package programmers;

public class Solution_Lv1_부족한금액계산하기 {
	public long solution(int price, int money, int count) {
		long answer = -1;
		long sum = 0;

		for (int i = 1; i <= count; i++) {
			sum += price * i;
		}

		if (sum > money) {
			answer = (long) sum - money;
		} else {
			answer = 0;
		}

		return answer;
	}
}
