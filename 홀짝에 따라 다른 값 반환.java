class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n % 2 == 1) { // n이 홀수일 때
            for (int i = 1; i <= n; i += 2) {
                answer += i;
            }
        } else { // n이 짝수일 때
            for (int i = 2; i <= n; i += 2) {
                answer += i * i;
            }
        }
        
        return answer;
    }
}


✅ 요약
홀수만 반복	for (int i = 1; i <= n; i += 2)
짝수만 반복	for (int i = 2; i <= n; i += 2)
