package programmers;

public class Solution_Lv1_핸드폰번호가리기 {
	/*
	 * 최대한 있는 그대로로 하기
	 */
	public String solution(String phone_number) {
		String answer = "";

		for (int i = 0; i < phone_number.length() - 4; i++) {
			answer += "*";
		}
		for (int i = phone_number.length() - 4; i < phone_number.length(); i++) {
			answer += phone_number.charAt(i);
		}
		// answer += phone_number.substring(phone_number.length() - 4);
		return answer;
	}
}