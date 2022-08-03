package programmers;

class Solution_Lv1_제일작은수제거하기 {
	/*
	 * list는 length이 아니라 size()
	 * import하는거
	 * 반환값이 배열이라면 어떤 배열이 나와도 ok
	 */
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