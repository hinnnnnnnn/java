class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
        
        if (num_list.length >= 11) { //배열의 길이는 length 사용
            for(int num : num_list) {
                sum += num;
            }
            return sum; //return 값 필수
        } else {
            for(int num : num_list) {
                mul *= num;
            }
            return mul;
        }
    }
}
