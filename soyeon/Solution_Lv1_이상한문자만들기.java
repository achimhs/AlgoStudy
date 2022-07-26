package programmers;

public class Solution_Lv1_이상한문자만들기 {
    public String solution(String s) {
        /*
        * 대분류: 문자열
        * 중분류: 전체를 인덱스로 볼지 / st를 써서 그 안에서 배열로 또 나눌지
        * 소분류
        * 포인트1 - split(" ")는 공백 분류 / split("")는 문자 하나하나 분류
        * 포인트2 - 공백을 만나면 인덱스를 0으로 처리(우선순위1)
        * 포인트3 - arr[i].equals(" ")와 arr[i]==" " 차이(==는 객체의 주소를 비교하는 연산자이며 equals는 객체의 값을 비교하는 함수이다.
        * 포인트4 - toUpperCase()와 toLowerCase()를 알아야 함
        */
        String answer = "";
        int idx=0;
        String[] arr = s.split("");
        
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(" ")){
                answer += " ";
                idx=0;
            }else if(idx%2==0){
                answer += arr[i].toUpperCase();
                idx++;
            }else{
                answer += arr[i].toLowerCase();
                idx++;
            }
        }
        return answer;
    }
}