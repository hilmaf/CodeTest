import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력 받기
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        // map 준비
        HashMap<Character, Integer> strMap = new HashMap<>();

        // map 초기화 or 값 넣어주기
        for (char x : str1.toCharArray()) {
            strMap.put(x, strMap.getOrDefault(x, 0)+1);
        }


        // 배열2를 for문 돌면서 1씩 빼주기
        // if : strMap에 배열2의 문자가 없다 OR strMap에서 해당 배열2 문자 key의 value값이 이미 0이다
        String answer = "YES";

        for(char x : str2.toCharArray()) {
            if(!strMap.containsKey(x) || strMap.get(x) == 0) {
                answer = "NO";
                break;
            }
            strMap.put(x, strMap.get(x)-1);
        }

        System.out.println(answer);
    }
}