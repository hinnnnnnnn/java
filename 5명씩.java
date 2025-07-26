class Solution {
    public String[] solution(String[] names) {
        int num = (names.length / 5) + 1;
        String[] answer = new String[num];
        
        int j = 0;
        for(int i=0 ; i<num; i++) {
            answer[i] = names[j];
            j = j + 5;
        }
        return answer;
    }
}
