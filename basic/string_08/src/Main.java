import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Main m = new Main();
        String result = m.solution(str.toLowerCase());

        System.out.println(result);
    }

    public String solution(String str) {
        // 알파벳을 제외한 문자는 모두 없애기
        String alphStr = "";
        for(char x : str.toCharArray()) {
            if(Character.isAlphabetic(x)) {
                alphStr += String.valueOf(x);
            }
        }


        char[] chars = alphStr.toCharArray();
        int forward = 0;
        int reverse = alphStr.length() - 1;

        while(forward < reverse) {
            char temp = chars[forward];
            if(chars[forward] != chars[reverse]) {
                return "NO";
            }

            forward++;
            reverse--;
        }

        return "YES";
    }
}