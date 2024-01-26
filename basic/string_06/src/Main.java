import java.util.*;

/**
 * 문제6. 중복문자 제거
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Main m = new Main();
        String result = m.solution(str);

        System.out.println(result);
    }

    public String solution(String str) {

        char[] chars = str.toCharArray();


        Set<Character> set = new HashSet<Character>();
        StringBuilder answer = new StringBuilder();
        for(char x : chars) {
            if(set.add(x)) {
                answer.append(x);
            }
        }

        return String.valueOf(answer);
    }
}