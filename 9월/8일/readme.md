## ✔️문제 사이트

https://school.programmers.co.kr/learn/courses/30/lessons/42842

## ✔️문제 설명

Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 노란색으로 칠해져 있고 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.

Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.

Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.

## ✔️제한사항

- 갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
- 노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.
- 카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.

## ✔️입출력 예

| brown | yellow | return |
| ----- | ------ | ------ |
| 10    | 2      | [4, 3] |
| 8     | 1      | [3, 3] |
| 24    | 24     | [8, 6] |

## ✔️나의 풀이

- 처음 풀이(4,6,7 테스트 오류)
  - 질문하기를 보다가 입력값 〉 12, 6 기댓값 〉 [8, 3]을 추가해보라고 했다. 근데 이걸로 채점해도 통과됨
  - `sum`으로 결과를 판정했는데 `yellow`로 결과를 판정했어야 했다.
  - loop 개념을 잘못알고 있었음(loop는 하나의 틀?로 이해해야한다.)
  - reak문의 중첩for문(안쪽 for문에서 break를 사용하면 바깥 for문은 못 빠져나감)

```java
class Solution {
	public int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		int sum = 0;

		sum = brown + yellow;
		loop: for (int i = 1; i <= sum; i++) {
			for (int j = 1; j <= sum; j++) {
				if (i * j == sum && i > j) {
					answer[0] = i;
					answer[1] = j;
					break loop;
				} else if (i == j && i * j == sum) {
					answer[0] = i;
					answer[1] = j;
					break loop;
				}
			}
		}
		return answer;
	}
}
```

- 두 번째 풀이(통과)

```java
class Solution {
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
```

## ✔️채점 결과

정확성: 100.0
합계: 100.0 / 100.0

## ✔️다른 사람의 풀이
