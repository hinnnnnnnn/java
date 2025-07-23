class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        for (int i=0; i<index_list.length; i++) {
            int idx = index_list[i];
            answer += my_string.charAt(idx);
    
        }
        return answer;
    }
}

charAt 메서드 간단 설명
charAt(int index) 는 문자열에서 특정 위치(index)의 문자 하나를 반환해주는 함수야.

예를 들어,

java
복사
편집
String s = "hello";
char c = s.charAt(1);  // 'e'가 반환됨 (인덱스는 0부터 시작)
문자열 "hello"에서 인덱스 1 위치는 두 번째 문자 'e'야.
