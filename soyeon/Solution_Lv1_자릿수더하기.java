package programmers;

public class Solution_Lv1_자릿수더하기 {
	/*
	 * 대분류: 숫자 자릿수 
	 * 중분류: 배열을 만들어서 처리할지 / charAt()-'0' 
	 * 포인트1: 숫자를 문자열로 일단 바꿔놔야 length()를 쓸 수 있다
	 */
	public int solution(int n) {
		int answer = 0;
		String str = n + "";

		for (int i = 0; i < str.length(); i++) {
			answer += str.charAt(i) - '0';
		}
		return answer;
	}
}