import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for (int i=0; i<a.length(); i++) { //문자열의 길이만큼 반복하면서, 각 문자 하나씩 처리하려고 for문 사용
            char c = a.charAt(i); //문자열 a의 i번째 문자를 char형으로 가져와서 변수 c에 저장
            if(Character.isUpperCase(c)) {
                System.out.print(Character.toLowerCase(c));
            } else {
                System.out.print(Character.toUpperCase(c));
            }
            
        }
    }
}
