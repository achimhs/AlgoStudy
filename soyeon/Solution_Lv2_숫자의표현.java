package programmers;

public class Solution_Lv2_숫자의표현 {
	/*
	 * 처음에 95.8? 테케 18번이 안 맞음 -> sum += i을 else부분으로 바꾸고 count를 미리 1 올려줌
	 */

	public int solution(int n) {
		int count = 1, sum = 0, start = 1; // 총개수, 숫자들의 합, 시작값

		label: for (int i = start; i <= n; i++) {
			if (sum == n) {
				count++;
				sum = 0;
				start++;
				i = start;
				continue label;
			} else if (sum > n) {
				sum = 0;
				start++;
				i = start;
				continue label;
			} else {
				sum += i;
			}
		}
		return count;
	}
}