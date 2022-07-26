package programmers;

class Solution_Lv1_제일작은수제거하기 {
	public int[] solution(int[] arr) {
		if (arr.length == 1) {
			int[] answer = { -1 };
			return answer;
		}
		
		int[] answer = new int[arr.length-1];
		for (int i = 0; i < arr.length - 1; i++) {
			answer[i] = arr[arr.length - i - 1];
		}
		return answer;

	}
}