class Solution {
    public int solution(int[] num_list) {
        int sum = 0; //sum: 숫자들을 모두 더할 변수 → 처음엔 0으로 시작
        int mul = 1; //mul: 숫자들을 모두 곱할 변수 → 처음엔 1로 시작
        
        for(int num : num_list) {
            sum += num;
            mul *= num;
        }
        return mul < sum*sum ? 1 : 0;
    }
}
