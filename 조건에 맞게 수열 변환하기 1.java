class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        for(int i=0; i<arr.length; i++) {
            int num = arr[i];
            
            if(num >= 50 && num % 2 == 0) {
                answer[i] = num / 2;
            } else if(num < 50 && num % 2 == 1) {
                answer[i] = num * 2;
            } else {
                answer[i] = num;
            }
        }
        return answer;
    }
}

🔎 문제
정수 배열 arr가 주어짐
arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱함
그 결과인 정수 배열을 return 하는 solution 함수 완성하기
