## ✔️문제 사이트

https://school.programmers.co.kr/learn/courses/30/lessons/77884

## ✔️문제 설명

두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

## ✔️제한사항

- 1 ≤ left ≤ right ≤ 1,000

## ✔️입출력 예

| left | right | result |
| ---- | ----- | ------ |
| 13   | 17    | 43     |
| 24   | 27    | 52     |

## ✔️입출력 예 설명

- 입출력 예 #1

      다음 표는 13부터 17까지의 수들의 약수를 모두 나타낸 것입니다.

  따라서, 13 + 14 + 15 - 16 + 17 = 43을 return 해야 합니다.

- 입출력 예 #2

      다음 표는 24부터 27까지의 수들의 약수를 모두 나타낸 것입니다.

  따라서, 24 - 25 + 26 + 27 = 52를 return 해야 합니다.

## ✔️나의 풀이

```java
class Solution {
 	public int solution(int left, int right) {
		int answer = 0;
		int count;

		for (int i = left; i <= right; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count % 2 == 0)
				answer += i;
			else
				answer -= i;
		}
		return answer;
	}
}
```

## ✔️채점 결과

정확성: 100.0
합계: 100.0 / 100.0

## ✔️다른 사람의 풀이

- 제곱수인 경우 약수의 개수가 홀수
- 제곱수가 아닌 경우 약수의 개수가 짝수

```java
class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }
}
```
