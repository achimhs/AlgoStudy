package programmers;

public class Solution_Lv1_문자열내p와y의개수 {
	boolean solution(String s) {
//		s = s.toUpperCase();
//		s.charAt(i) == 'p' //배열 안 쓰고;
		boolean answer = true;
		int pCount = 0;
		int yCount = 0;

		String[] arr = s.split("");

		for (int i = 0; i < s.length(); i++) {
			if (arr[i].equals("p") || arr[i].equals("P")) {
				pCount++;
			} else if (arr[i].equals("y") || arr[i].equals("Y")) {
				yCount++;
			} else {

			}
		}
		if (pCount == yCount) {
			return true;
		} else {
			return false;
		}
	}
}