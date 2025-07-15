class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals(">")) {
            if (eq.equals("=")) return n >= m ? 1 : 0;
            if (eq.equals("!")) return n > m ? 1 : 0;
        } else if (ineq.equals("<")) {
            if (eq.equals("=")) return n <= m ? 1 : 0;
            if (eq.equals("!")) return n < m ? 1 : 0;
        }
        // 예외 입력일 경우 안전하게 처리
        return 0;
    }
}

즉, ineq나 eq에 예상하지 못한 값이 들어왔을 때 함수가 어떤 값도 반환하지 않으면 컴파일 에러가 발생하기 때문에, 꼭 마지막에 기본값(예: 0)을 반환하게 해줘야 함
