class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1]; // 1. 배열 크기 지정

        int num = 0; // 2. 배열 인덱스 역할을 할 변수 초기화
        for (int i = start_num; i <= end_num; i++) { // 3. start_num부터 end_num까지 반복
            answer[num] = i; // 4. 현재 숫자 i를 배열 answer의 num번째 위치에 저장
            num++; // 5. 배열 인덱스 1 증가
        }
        return answer; // 6. 배열 반환
    }
}
