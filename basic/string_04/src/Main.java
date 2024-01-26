import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 문제4. 문자열 뒤집기
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 몇 개의 단어를 입력받을 것인가
        int num = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기 작업

        // 입력받은 단어를 배열로 관리할 것
        String[] strings = new String[num];

        // 단어 입력받기
        for (int i = 0; i < num; i++) {
            strings[i] = sc.nextLine();
        }

        List<String> reverseStrings = solution1(strings);

        for(String z : reverseStrings) {
            System.out.println(z);
        }

        sc.close();

    }

    private static List<String> solution1(String[] strings) {
        List<String> reverseStrings = new ArrayList<String>();

        for(String x : strings) {
            char[] string = x.toCharArray();
            int forward = 0;
            int reverse = x.length()-1;

            while(forward < reverse) {
                char forwardString_ = string[forward];
                string[forward] = string[reverse];
                string[reverse] = forwardString_;
                forward++;
                reverse--;
            }

            reverseStrings.add(String.valueOf(string));
        }

        return reverseStrings;

    }

}