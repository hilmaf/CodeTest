import java.util.Scanner;

/**
 * 문제 5. 문자 뒤집기
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String result = solution(str);
        System.out.println(result);
    }

    public static String solution(String str) {
        int forward = 0; // 순방향 인덱스
        int reverse = str.length()-1; // 역방향 인덱스
        char[] chars = str.toCharArray(); // 문자열 => char배열

        // chars[forward]가 알파벳이 아닐 때 순방향 index 오른쪽으로 한칸 이동, 역방향 index는 그 자리에
        // chars[reverse]가 알파벳이 아닐 때 순방향 index는 그 자리에, 역방향 index 왼쪽으로 한 칸 이동
        // 그 외(=chars[forward]와 chars[reverse]가 모두 알파벳일 때)의 경우
        // 순방향 index 오른쪽으로 한칸 이동, 역방향 index 왼쪽으로 한 칸 이동
        while(forward < reverse) {
            if(!Character.isAlphabetic(chars[forward])) {
                forward++;
            } else if(!Character.isAlphabetic(chars[reverse])) {
                reverse--;
            } else {
                char temp = chars[forward];
                chars[forward] = chars[reverse];
                chars[reverse] = temp;

                forward++;
                reverse--;
            }
        }

        return String.valueOf(chars);
    }

}