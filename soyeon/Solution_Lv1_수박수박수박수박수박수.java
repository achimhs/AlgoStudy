package programmers;

public class Solution_Lv1_수박수박수박수박수박수 {
	public String solution(int n) {
		String answer = "";
		int count = 0;

		while (count < n) {
			if (count % 2 == 0) {
				answer += "수";
			} else {
				answer += "박";
			}
			count++;
		}
		return answer;
	}
}
