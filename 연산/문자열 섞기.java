class Solution {
    public String solution(String str1, String str2) {
        String a = "";

        for (int i = 0; i < str1.length(); i++) {
            a += str1.charAt(i);   // str1의 i번째 문자 추가
            a += str2.charAt(i);   // str2의 i번째 문자 추가
        }
      
        return a;
    }
}



class Solution {
    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            sb.append(str1.charAt(i));  // str1의 문자 추가
            sb.append(str2.charAt(i));  // str2의 문자 추가
        }

        return sb.toString();
    }
}
