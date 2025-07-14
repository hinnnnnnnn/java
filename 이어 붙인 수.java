class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = 0;
        int b = 0;
        
        for(int num : num_list) {
            if(num % 2 == 0) {
                a *= 10;
                a += num;
            } else {
                b *= 10;
                b += num;
            }
        }
        answer = a + b;
        
        return answer;
    }
}


class Solution {
    public int solution(int[] num_list) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for (int num : num_list) {
            (num % 2 == 0 ? a : b).append(num);
        }

        return Integer.parseInt(a.toString()) + Integer.parseInt(b.toString());
    }
}
