class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) { //queries 배열 안의 각 쌍(query)을 하나씩 꺼내 반복
            int i = query[0], j = query[1]; //각 query에서 바꿀 인덱스 i와 j를 가져옴
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
