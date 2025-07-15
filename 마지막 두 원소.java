class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1]; //원래 배열보다 1칸 더 큰 배열
        
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i]; //기존 배열(num_list)의 내용을 그대로 answer 배열에 복사
        }
        
        int last = num_list[num_list.length - 1];
        int before = num_list[num_list.length - 2];
        
        answer[answer.length - 1] = last > before ? last - before : last * 2;
        
        return answer;
    }
}
