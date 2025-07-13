class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0; // 현재 모드를 나타냄 (0 또는 1)
        for (int i = 0; i < code.length(); i++) {
            char current = code.charAt(i);
            if (current == '1') {  // '1'을 만나면 mode를 전환하고 다음 문자로 넘어감
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if (i % 2 == mode) { // 현재 인덱스가 mode와 같은 홀/짝수일 때만 문자 추가
                answer.append(current);
            }
        }
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}

💡 핵심!
• 처음에 mode = 0
• '1' 나오면 mode 전환, 그 문자는 무조건 스킵
• mode에 따라 짝수/홀수 인덱스에서만 글자 추가
• 끝났는데 아무 글자도 없으면 → "EMPTY"
