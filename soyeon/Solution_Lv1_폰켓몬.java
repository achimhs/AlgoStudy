package programmers;

import java.util.HashSet;

public class Solution_Lv1_폰켓몬 {
	/*
	 * size와 max의 크기를 비교해서 출력하는 것까지 생각 못함 
	 * 함수체크
	 */
	public int solution(int[] nums) {
		int max = nums.length / 2;

		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			hs.add(nums[i]);
		}
		if (hs.size() > max) {
			return max;
		} else {
			return hs.size();
		}
	}
}