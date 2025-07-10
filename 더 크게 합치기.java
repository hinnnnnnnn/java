class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b)); //String → int 변환할 때 사용하는 표준 함수
        int ba = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        return ab >= ba ? ab : ba ;
    }
}
