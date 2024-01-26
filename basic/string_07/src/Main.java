import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Main m = new Main();
        String answer = m.solution(str);
        System.out.println(answer);
    }

    public String solution(String str) {
        String lowerStr = str.toLowerCase();

        char[] chars = lowerStr.toCharArray();

        int forward = 0;
        int reverse = lowerStr.length()-1;

        boolean yn = false;
        for(char x : chars) {
            while(forward < reverse) {
                char temp = chars[forward];
                if (chars[forward] != chars[reverse]) {
                    return "NO";
                }
                forward++;
                reverse--;
            }
        }

        return "YES";
    }
}