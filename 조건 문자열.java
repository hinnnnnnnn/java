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
