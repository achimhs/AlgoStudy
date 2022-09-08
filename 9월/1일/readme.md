## ✔️문제 사이트

https://school.programmers.co.kr/learn/courses/30/lessons/42583

## ✔️문제 설명

트럭 여러 대가 강을 가로지르는 일차선 다리를 정해진 순으로 건너려 합니다. 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다. 다리에는 트럭이 최대 bridge_length대 올라갈 수 있으며, 다리는 weight 이하까지의 무게를 견딜 수 있습니다. 단, 다리에 완전히 오르지 않은 트럭의 무게는 무시합니다.

예를 들어, 트럭 2대가 올라갈 수 있고 무게를 10kg까지 견디는 다리가 있습니다. 무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.

![](../2%EC%9D%BC/%EB%8B%A4%EB%A6%AC%EB%A5%BC.jpg)

따라서, 모든 트럭이 다리를 지나려면 최소 8초가 걸립니다.

solution 함수의 매개변수로 다리에 올라갈 수 있는 트럭 수 bridge_length, 다리가 견딜 수 있는 무게 weight, 트럭 별 무게 truck_weights가 주어집니다. 이때 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 return 하도록 solution 함수를 완성하세요.

## ✔️제한사항

- bridge_length는 1 이상 10,000 이하입니다.
- weight는 1 이상 10,000 이하입니다.
- truck_weights의 길이는 1 이상 10,000 이하입니다.
- 모든 트럭의 무게는 1 이상 weight 이하입니다.

## ✔️입출력 예

| citations | weight | truck_weights                   | return |
| --------- | ------ | ------------------------------- | ------ |
| 2         | 10     | [7,4,5,6]                       | 8      |
| 100       | 100    | [10]                            | 101    |
| 100       | 100    | [10,10,10,10,10,10,10,10,10,10] | 110    |

## ✔️나의 풀이

-

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

## ✔️다른 사람의 풀이
