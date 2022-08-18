package programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution_Lv2_가장큰수 {
	/*
	 * 1.문자열도 정렬이 되구나
	 * 2.compareTo함수는 문자열도 비교가 되구나
	 * 3.내림차순으로 정렬하고 싶다면 매개변수의 순서를 바꿔주면 된다.
	 * 4.람다 함수를 이용해 코드를 간략화 
	 */
	public String solution(int[] numbers) {
		String[] strArr = new String[numbers.length];

		// 숫자를 문자열로 바꿔서 배열에 넣어줌
		for (int i = 0; i < numbers.length; i++) {
			strArr[i] = numbers[i] + "";
		}
		// 문자열은 sort가 될까? -> 첫번째 문자열 비교(만약 같다면 다음 문자열로)
		Arrays.sort(strArr, (n1, n2) -> (n2 + n1).compareTo(n1 + n2)); // 303 330
//		System.out.println(Arrays.toString(strArr));
		
		 return strArr[0].equals("0") ? "0" : Arrays.stream(strArr).collect(Collectors.joining());
	}
}