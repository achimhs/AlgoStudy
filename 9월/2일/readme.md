## ✔️문제 사이트

https://school.programmers.co.kr/learn/courses/30/lessons/42747

## ✔️문제 설명

H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다. 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.

어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.

어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.

## ✔️제한사항

- 과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
- 논문별 인용 횟수는 0회 이상 10,000회 이하입니다.

## ✔️입출력 예

| citations       | return |
| --------------- | ------ |
| [3, 0, 6, 1, 5] | 3      |

## ✔️입출력 예 설명

이 과학자가 발표한 논문의 수는 5편이고, 그중 3편의 논문은 3회 이상 인용되었습니다. 그리고 나머지 2편의 논문은 3회 이하 인용되었기 때문에 이 과학자의 H-Index는 3입니다.

## ✔️나의 풀이

- 문제를 이해하는데 오래걸림(편 vs 번)
- 편은 개수를 카운트해야하고, 나머지 논문은 h번 이하면 무조건 ok니까 flag로 설정

```java
import java.util.*;

class Solution {
    //편 vs 번
    public int solution(int[] citations) {
 		int answer = 0;
		int count;
		boolean flag = false;
		int n = citations.length;// 논문 n편

		Arrays.sort(citations); // 0 1 3 5 6

		for (int h = 1; h <= 10000; h++) {// 논문별 인용 횟수는 0회 이상 10,000회 이하입니다.
			count = 0;
			flag = false;
			int[] temp = new int[n];// flag를 둘 배열 생성
			// answer=0; 을 하면 안됨 : answer을 최댓값을 구해야 하니까

			for (int i = 0; i < n; i++) {
				if (citations[i] >= h) {
					count++; // 편의 개수를 구함
					temp[i] = -1;
				}
			}

			for (int i = 0; i < n; i++) {
				if (temp[i] != -1) {// 나머지 논문중에서
					if (citations[i] >= h) { // 나머지 논문이 h번 이하이면 되니까
						flag = true;
						break;
					}
				}
			}
			if (flag == false && count >= h) { // h번 이상 인용된 논문이 h'편' 이상이고 나머지 논문이 h'번' 이하 인용되었다면
				answer = h;
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
