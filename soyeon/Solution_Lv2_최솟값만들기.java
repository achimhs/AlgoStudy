package programmers;

import java.util.Arrays;
import java.util.Collections;

public class Solution_Lv2_최솟값만들기 {

	public int solution(int[] A, int[] B) {
		int max = Integer.MIN_VALUE;
		int gop = 0;

		Integer[] b = new Integer[B.length];

		for (int i = 0; i < b.length; i++)
			b[i] = B[i];

		Arrays.sort(A);
		Arrays.sort(b, Collections.reverseOrder());// 그냥 int배열엔 sort안 되고 integer로 해야함 collection이라

		for (int i = 0; i < A.length; i++) {
			gop = gop + (A[i] * b[i]);
			if (gop > max) {
				max = gop;
			}
		}

		return max;
	}
}