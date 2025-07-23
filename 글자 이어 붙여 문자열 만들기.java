class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        for (int i = 0; i < index_list.length; i++) {
            int idx = index_list[i];          // 인덱스 번호를 꺼내고
            answer += my_string.charAt(idx);  // 해당 위치 문자 가져와서 answer에 붙임
        }
        
        return answer;
    }
}

🔎 charAt 메서드 간단 설명
charAt(int index) 는 문자열에서 특정 위치(index)의 문자 하나를 반환해주는 함수
