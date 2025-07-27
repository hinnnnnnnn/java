class Solution {
    public int[] solution(int n, int k) {
        int size = n / k ;
        int[] answer = new int[size];
        
        for(int i=0; i<size; i++) {
            answer[i] = k;
            k = k + k ;
          
        }
        return answer;
    }
}


k의 배수를 구하는 공식
k * (i + 1);
