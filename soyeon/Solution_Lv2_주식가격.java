package programmers;

public class Solution_Lv2_주식가격 {
	/*
	 * stack+배열로 풀었다가 시간초과
	 * 주식 가격이 떨어지면 count 안 한다
	 */
	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		int count = 0;

		for (int i = 0; i < prices.length; i++) {
			count = 0;
			for (int j = i + 1; j < prices.length; j++) {
				count++; // 자기자신 일단 증가하고
				if (prices[i] > prices[j]) {// 이후 주식가격이 넘어가는 것은 카운트에서 아예 제외시키기 위해(=문제를 잘못이해하고 있었음)
					break;// break문을 넣어서 시간초과 안나게
				}
			}
			answer[i] = count;
		}
		return answer;
	}
}
//	#1
//	public int[] solution(int[] prices) {
//		int[] answer = new int[prices.length];
//		int count = 0;
//		Stack<Integer> st = new Stack<>();
//
//		for (int i = 0; i < prices.length; i++) {
//			st.push(prices[i]);
//			count = 0;
//			for (int j = i + 1; j < prices.length; j++) {
//				if (st.peek() <= prices[j]) {
//					count++;
//				}
//			}
//			answer[i] = count;
//		}
//		return answer;
//	}
//}

// #2
//	public int[] solution(int[] prices) {
//		int[] answer = new int[prices.length];
//		int count = 0;
//
//		for (int i = 0; i < prices.length; i++) {
//			count = 0;
//			for (int j = i + 1; j < prices.length; j++) {
//				if (prices[i] <= prices[j]) {
//					count++;
//				}
//			}
//			answer[i] = count;
//		}
//		return answer;
//	}
//}

//# 2 -> 보완
//	public int[] solution(int[] prices) {
//		int[] answer = new int[prices.length];
//		int count = 0;
//
//		for (int i = 0; i < prices.length; i++) {
//			count = 0;
//			for (int j = i + 1; j < prices.length; j++) {
//				count++;
//				if (prices[i] > prices[j]) {
//					break;
//				}
//			}
//			answer[i] = count;
//		}
//		return answer;
//	}
//}


// #3
//	public int[] solution(int[] prices) {
//		int[] answer = new int[prices.length];
//
//		for (int i = 0; i < prices.length; i++) {
//			for (int j = i + 1; j < prices.length; j++) {
//				answer[i]++;
//				if (prices[i] > prices[j])
//					break;
//			}
//		}
//		return answer;
//	}
//}