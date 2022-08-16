package programmers;

import java.util.Arrays;

public class Solution_Lv2_JadenCase문자열만들기 {
	/*
	 * split(" ",-1)은 공백이 나오면 그 전까지 자르고 -1은 맨뒤 공백까지 출력
	 * 문자열 -> 대문자(문자열.toUpperCase())
	 * 문자 -> 대문자(Character.toUpperCase(문자))
	 * subString이 아니라 substring이다.
	 * 공백이 여러개면 그대로 여러개 출력!!!  문자만 바껴야 한다
	 */
	public static void main(String[] args) {
		String s = "this is   weeKeNd   ";
		String[] strArr = s.toLowerCase().split(" ", -1);// 공백을 만나면 분리
		int flag = 0;
		String result = "";

		System.out.println(Arrays.toString(strArr));

		for (int i = 0; i < strArr.length; i++) {//1.strArr의 공백을 인식을 안 한다 
			flag = 0;
			for (int j = 0; j < strArr[i].length(); j++) {
				char c = strArr[i].charAt(j);
				System.out.println(c);
				if (c !=' ' && flag == 0) {
					result += Character.toUpperCase(c);
					flag = 1;
				} else if (c == ' ') {
					result += " ";
				} else {
					result += strArr[i].charAt(j);
				}
			}
		}
		System.out.println(result);
	}
}