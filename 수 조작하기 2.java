class Solution {
    public String solution(int[] numLog) {
        String answer = "";

        int temp = numLog[0]; //기준값 temp에 첫 번째 값을 저장 

        for(int i=1; i<numLog.length; i++){ //두 번째 값부터 끝까지 반복하면서 변화량을 확인

           switch(numLog[i]-temp) { //현재 값과 이전 값(temp)의 차이를 이용해 어떤 입력이었는지 판별
                case 1:
                   answer += "w";
                   break;
                case -1:
                   answer += "s";
                   break;
                case 10:
                   answer += "d";
                   break;
                case -10:
                   answer += "a";
                   break;
           }
            temp = numLog[i]; //다음 루프를 위한 기준값 갱신
        }
        return answer;
    }
}
