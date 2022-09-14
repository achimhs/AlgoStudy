## ✔️문제 사이트

https://school.programmers.co.kr/learn/courses/30/lessons/12935

## ✔️문제 설명

정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

## ✔️제한사항

- arr은 길이 1 이상인 배열입니다.
- 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

## ✔️입출력 예

| arr       | return  |
| --------- | ------- |
| [4,3,2,1] | [4,3,2] |
| [10]      | [-1]]   |

## ✔️나의 풀이

- 가장 작은 수를 구하는 방법 2가지 (sort✔️/for문 돌려서 일일이 비교)
- 작은 수를 제거하고 넣을 ArrayList
- al을 배열로 만드는 과정
- {-1}이 들어있는 answer2배열 생성

```java
import java.util.*;

class Solution {
  public int[] solution(int[] arr) {
		int[] temp = new int[arr.length];// 임시배열 만듦
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		Arrays.sort(temp);
		int min = temp[0];// 배열중에서 가장 작은 값

		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != min) {// arraylist에 제일 작은 수를 제거하고 순서대로 넣음
				al.add(arr[i]);
			}
		}

		// al를 배열로 만드는 작업
		int[] answer = new int[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++) {
			answer[i] = al.get(i);
		}

		int[] answer2 = { -1 };

		if (answer.length > 0) {
			return answer;
		} else {
			return answer2;
		}
	}
}
```

## ✔️채점 결과

정확성: 100.0
합계: 100.0 / 100.0

## ✔️다른 사람의 풀이
