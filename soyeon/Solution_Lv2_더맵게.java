package programmers;

import java.util.PriorityQueue;

public class Solution_Lv2_더맵게 {
	/*
	 * heap의 size가 2보다 작다는 것이 왜 인지(7,1 1, 1 6) 
	 * size가 2보다 작으면 break문으로 빠져 나가야 하는데 안해줘서 밑에까지 실행돼서 런타임 에러
    //int형 priorityQueue 선언 (우선순위가 낮은 숫자 순)
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    //int형 priorityQueue 선언 (우선순위가 높은 숫자 순)
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
    */
	public int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> heap = new PriorityQueue<>();

		for (int s : scoville) {
			heap.offer(s);
		}

		while (heap.peek() < K) {
			// 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return 합니다.
			if (heap.size() < 2) {
				answer = -1;
				break; // break를 안 해서 런타임 에러남
			}
			int n1 = heap.poll();
			int n2 = heap.poll();
			int newN = n1 + (n2 * 2);
			heap.add(newN);
			answer++;
		}
		return answer;
	}
}