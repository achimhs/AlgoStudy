package programmers;

public class Solution_Lv1_자연수뒤집어배열로만들기 {   
		/*
	    * 대분류: 숫자 -> 배열
	    * 중분류: 숫자를 문자열로 만들어 -> 빈 배열에 하나씩
	    * 소분류:
	    * 포인트1: 문자열의 끝에서부터 넣어주는 것(-1 해줘야함!)
	    */
	public int[] solution(long n) {
		String ns = n + "";
		int[] answer = new int[ns.length()];

		for (int i = 0; i < ns.length(); i++) {
			answer[i] += ns.charAt(ns.length() - i - 1) - '0';
		}
		return answer;
	}
}