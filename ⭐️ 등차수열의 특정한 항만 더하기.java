class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for(int i = 0; i < included.length; i++){ //배열.length → 괄호 ❌
            if(included[i]){
                answer +=  a + (d*i); //등차수열의 i번째 항을 구하는 공식
            }
        }

        return answer;
    }
}
