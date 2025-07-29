class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        for(int i = 0; i < control.length(); i ++) {
            char ch = control.charAt(i);
            
            if(ch == 'w') { //char랑 string이랑 비교
                answer += 1;
            }
            
            if(ch == 's') {
                answer -= 1;
            }
            
            if(ch == 'd') {
                answer += 10;
            }
            
             if(ch == 'a') {
                answer -= 10;
            }
        }
        return answer;
    }
}
