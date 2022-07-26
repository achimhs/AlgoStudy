package programmers;

public class Solution_Lv1_가운데글자가져오기 {
	/*
	 * substring 쓰면 더 좋을 듯
	 */
	public String solution(String s) {
		String answer = "";
		if (s.length() % 2 != 0) {
			String s1 = s.charAt(s.length() / 2) + "";
//			String s1 = s.substring(s.length()/2,s.length()/2+1)+"";
			return s1;
		} else {
			String s2 = s.charAt(s.length() / 2 - 1) + "";
			String s3 = s.charAt(s.length() / 2) + "";
			return s2 + s3;
		}
	}
}