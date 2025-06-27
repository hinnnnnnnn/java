class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String before = my_string.substring(0, s); //my_string의 0번 인덱스부터 s-1번 인덱스까지의 부분 문자열을 추출
        String after = my_string.substring(s + overwrite_string.length()); //덮어쓰기 구간의 끝 다음부터 끝까지의 문자열을 추출
        return before + overwrite_string + after;
    }
}
