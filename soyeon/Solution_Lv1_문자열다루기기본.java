package programmers;

public class Solution_Lv1_문자열다루기기본 {
	/*
	 * 숫자인지 아닌지 판별은 숫자 범위를 지정하기
	 * 문자 charAt을 '0'~'9'으로 지정 가능함
	 */
	public boolean solution(String s) {
		if (s.length() != 4 && s.length() != 6) {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < '0' || s.charAt(i) > '9') {
//				if (s.charAt(i)-'0' < 0 || s.charAt(i)-'0' > 9) {
				return false;
			}
		}
		return true;
	}
}