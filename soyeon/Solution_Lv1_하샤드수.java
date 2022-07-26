package programmers;

public class Solution_Lv1_하샤드수 {
	/*
	 * 최종으로 x의 값을 다시 반환해야 하므로 num이라는 곳에 x의 값을 넣어둔다.
	 */
	public boolean solution(int x) {
		boolean answer = true;
		int num = x;
		int sum = 0;

		while (num != 0) {
			sum += num % 10;
			num = num / 10;
		}
		answer = (x % sum == 0) ? true : false;
		return answer;
	}
}

// 금 4시
// 코테 집중
// 기업은행 노랭이 다시풀기
