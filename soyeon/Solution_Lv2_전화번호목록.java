package programmers;

import java.util.Arrays;
import java.util.HashMap;

public class Solution_Lv2_전화번호목록 {
	/*
	 * 크게 for문으로 전화번호 목록 -> while문으로 한 배열의 문자가 끝날때까지 계속 비교 
	 * startsWith() -> 짧은 길이인 문자열을 기준으로 for문을 돌려야하는데 모르겠음 -> 길이만큼 문자열이 특정 문자 또는 문자열로 시작하는지 체크하는 함수(단,공백도 취급) 
	 * endsWith() -> 특정 문자 또는 문자열로 끝나는지 체크(단,공백도 취급)
	 */
	public boolean solution(String[] phone_book) {
		
//		#1.startWith함수
		Arrays.sort(phone_book);

		for (int i = 0; i < phone_book.length - 1; i++) { // 배열의 길이 때문에 -1해주거나 if문으로 설정
			if (phone_book[i + 1].startsWith(phone_book[i]))
				return false;
		}
		return true;

//		#2.hashmap
//		HashMap<String, Integer> hash = new HashMap<>();
//		for (int i = 0; i < phone_book.length; i++) {
//			hash.put(phone_book[i], i);// HashMap에 일단 다 넣기
//		}
//
//		for (int i = 0; i < phone_book.length; i++) {
//			for (int j = 0; j < phone_book[i].length(); j++) {
//				if (hash.containsKey(phone_book[i].substring(0, j))) {// 내가 궁금했던 문제를 파악해줌. 나는 if문으로 일일이 비교하려 했음
//					return false;
//				}
//			}
//		}
//		return true;

	}
}
