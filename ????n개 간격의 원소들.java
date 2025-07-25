class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = (num_list.length + n - 1) / n;
        int[] answer = new int[size];

        int j = 0; // num_list에서 n 간격으로 접근할 인덱스

        for (int i = 0; i < size; i++) {
            answer[i] = num_list[j];
            j = j + n; // n칸씩 건너뜀
        }

        return answer;
    }
}

class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = (num_list.length + n - 1) / n;
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            answer[i] = num_list[i * n]; // 핵심 부분
        }

        return answer;
    }
}
