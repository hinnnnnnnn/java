class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i]; // 누적해서 더하기
            
            if (answer > n) {
                break; // ⭐️n보다 커지면 종료⭐️
            }
        }
        
        return answer;
    }
}
