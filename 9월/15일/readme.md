## ✔️문제 사이트

https://school.programmers.co.kr/learn/courses/30/lessons/68935#qna

## ✔️문제 설명

자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

## ✔️제한사항

- n은 1 이상 100,000,000 이하인 자연수입니다.

## ✔️입출력 예

| n   | result |
| --- | ------ |
| 45  | 7      |
| 125 | 229    |

## ✔️입출력 예 설명

- 입출력 예 #1
  답을 도출하는 과정은 다음과 같습니다.
  n (10진법) n (3진법) 앞뒤 반전(3진법) 10진법으로 표현
  45 1200 0021 7
  따라서 7을 return 해야 합니다.

- 입출력 예 #2
  답을 도출하는 과정은 다음과 같습니다.
  n (10진법) n (3진법) 앞뒤 반전(3진법) 10진법으로 표현
  125 11122 22111 229
  따라서 229를 return 해야 합니다.

## ✔️나의 풀이

- 처음 풀이(40점) ➡️ 문제가 뭘까? ➡️ if문을 없애거나!!! / if문에서 -1을 하지 말던가!!

```java
import java.util.*;

class Solution {
	public int solution(int n) {
		int answer = 0;
		int remain = 0;
		String reverseN = "";

		// n의 위치 주의! 나머지 먼저하고 -> 몫 계산
		while (true) {
			if (n == 0)
				break;
			remain = n % 3; // 나머지
			n = n / 3; // 몫
			reverseN += remain;
		}
		System.out.println(reverseN);

		for (int i = 0; i < reverseN.length(); i++) {
			if (i == reverseN.length() - 1) {
				answer += 1;
			} else {
				answer += (reverseN.charAt(i) - '0') * Math.pow(3, reverseN.length() - 1 - i);
			}
		}

		System.out.println(answer);
		return answer;
	}
}
```

- 수정 답안

```java
         for (int i = 0; i < reverseN.length(); i++) {
			if (i == reverseN.length()) {
				answer += 1;
			} else {
				answer += (reverseN.charAt(i) - '0') * Math.pow(3, reverseN.length() - 1 - i);
			}
		}

         for (int i = 0; i < reverseN.length(); i++) {
			answer += (reverseN.charAt(i) - '0') * Math.pow(3, reverseN.length() - 1 - i);
		}
```

- 2번째 풀이(통과)
  - 스택 사용
  - 스택을 빼면 크기가 변하니까 미리 크기 설정하고 시작

```java
import java.util.*;

class Solution {
	public int solution(int n) {
		int answer = 0;
		int remain = 0;
		String reverseN = "";
		Stack<Integer> stack = new Stack<>();

		// n의 위치 주의! 나머지 먼저하고 -> 몫 계산
		while (true) {
			if (n == 0)
				break;
			remain = n % 3; // 나머지
			n = n / 3; // 몫
			stack.push(remain);
		}

        //스택을 빼면 크기가 변하니까 미리 크기 설정하고 시작
		int size = stack.size();
		for (int i = 0; i < size; i++) {
			int nn = stack.pop();
			answer += nn * Math.pow(3, i);
		}
		return answer;
	}
}
```

## ✔️채점 결과

정확성: 100.0
합계: 100.0 / 100.0

## ✔️다른 사람의 풀이
