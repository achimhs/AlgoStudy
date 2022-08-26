package programmers;

public class Solution_Lv2_124나라의숫자 {
	/*
	 * 1.3으로 나누어야 한다. 나머지가 numArr의 배열 번째 / 124나라의 값이 배열의 수
	 * 2.1,2,4를 배열로 만든다. -> numArr = {4,1,2}
	 * 3.n을 3으로 나눈 나머지: numArr의 배열번째 / 몫: 다시 3으로 나눈 나머지
	 * 4.n이 3으로 나누어 떨어지면 n-1하기
	 */
	public String solution(int n) {
		String[] arr = { "4", "1", "2" };
		String answer = "";

		while (n > 0) {
			int subN = n % 3;
			n = n / 3;

			if (subN == 0) {
				n--;
			}
			answer = arr[subN] + "" + answer;
			//answer += arr[subN]+""; //answer이 먼저 더해지고 그 다음에 arr[subN]이 더해져서 실패 
		}
		return answer;
	}
}
//	public String solution(int n) {
//		int[] numArr = { 4, 1, 2 };
//		String answer = "";
//
//		if (n == 1) { 
//			answer = 1 + "";
//		} else if (n == 2) {
//			answer = 2 + "";
//		} else if (n == 3) {
//			answer = 4 + "";
//		} else if (n % 3 == 0) {
//			int two = n % 3;
//			int first = (n+1 / 3) % 3;
//			answer = numArr[first] + "" + numArr[two] + "";
//		} else {
//			int two = n % 3;
//			int first = (n / 3) % 3;
//			answer = numArr[first] + "" + numArr[two] + "";
//		}
//		return answer;
//	}
//}