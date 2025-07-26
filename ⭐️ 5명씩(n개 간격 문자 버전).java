🔴 오류 코드
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

======================================================================================================================
✨ 그런데 문제가 있음: 자바에서 정수끼리 나누면 소수점은 무시돼서 버림이 돼.
    예를 들어: 6 / 5 = 1   ← 원래는 1.2인데 → .2는 버림
    하지만 우리는 조금이라도 남으면 한 번 더 뽑아야 해!

✅ 그래서 나오는 아이디어: 무조건 올림되게 하려면
    나눠지는 수 + (나누는 수 - 1)
    즉 (a + b - 1) / b

    이건 프로그래밍에서 정수 나눗셈 올림할 때 쓰는 정석 공식

🎓 공식 정리: 올림하려면 → (a + b - 1) / b
        
배열의 길이: names.length = a 
간격 (5명씩): b = 5
공식대로 넣으면: (names.length + 5 - 1) / 5 = (names.length + 4) / 5
    
이렇게 +4 해주는 이유는, 소수점이 생길 가능성이 있으면 무조건 1 더해서 한 번 더 뽑게 하기 위함
======================================================================================================================
    
🟢 문제 해결 코드
class Solution {
    public String[] solution(String[] names) {
        int num = (names.length + 5 - 1) / 5;
        String[] answer = new String[num];
        
        int j = 0;
        for(int i=0 ; i<num; i++) {
            answer[i] = names[j];
            j = j + 5;
        }
        return answer;
    }
}
