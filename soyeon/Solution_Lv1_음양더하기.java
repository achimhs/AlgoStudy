package programmers;

public class Solution_Lv1_음양더하기 {
	/*
	 * String의 길이는 length() / 배열의 길이는 length
	 */
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for (int i = 0; i < absolutes.length; i++) {
			if (signs[i] == true) {
				answer += absolutes[i];
			} else {
				answer -= absolutes[i];
			}
			// answer += absolutes[i] * (signs[i]? 1: -1);
		}
		return answer;
	}
}