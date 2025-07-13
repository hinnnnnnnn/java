class Solution {
    public int solution(int a, int b, int c) {
        int answer = a + b + c; //처음에 answer에 a + b + c의 합을 저장

        if (a == b || b == c || a == c) { //만약 a, b, c 중 두 개라도 같은 값이 있으면
            answer *= (a * a + b * b + c * c);
        }

        if (a == b && b == c) { //만약 a, b, c가 모두 같다면
            answer *= (a * a * a + b * b * b + c * c * c);
        }

        return answer;
    }
}

💡 조건 a == b && b == c가 참이라면, a == b || b == c || a == c는 무조건 참
   (셋이 다 같으면 당연히 두 개는 같으니까)
   따라서, answer값에 식이 누적되어 있기 떄문에 저 코드가 올바른 코드임
