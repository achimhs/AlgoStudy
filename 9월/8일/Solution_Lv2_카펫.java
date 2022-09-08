package programmers;

public class Solution_Lv2_카펫 {
	// loop를 잘못알고 있었음
	// break문의 중첩for문
	// 방법1 : brown+yellow=sum이고 i>j경우 바로 break;
	public int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		int sum = 0;

		// 세로의 최소 길이는 3(노란색 1줄이면 갈색은 2개여야 하니까)
		sum = brown + yellow;
		for (int row = 3; row <= sum; row++) {
			int col = sum / row;

			if (row > col)
				continue;

			if ((row - 2) * (col - 2) == yellow) {// 노란색 부분만 구하는 것
				answer[0] = col;
				answer[1] = row;
				return answer;
			}
		}
		return answer;
	}
}
//	public int[] solution(int brown, int yellow) {
//		int[] answer = new int[2];
//		int sum = 0;
//
//		sum = brown + yellow;
//		loop: for (int i = 1; i <= sum; i++) {
//			for (int j = 1; j <= sum; j++) {
//				if (i * j == sum && i > j) {
//					answer[0] = i;
//					answer[1] = j;
//					break loop;
//				} else if (i == j && i * j == sum) {
//					answer[0] = i;
//					answer[1] = j;
//					break loop;
//				}
//			}
//		}
//		return answer;
//	}
//}