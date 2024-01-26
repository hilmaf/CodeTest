import java.util.Scanner;

public class Main {

    // 문제2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Main main = new Main();
        String result = main.solution(str);
        System.out.println(result);
    }

    public String solution(String str) {
        String result = "";

        char[] strArr = str.toCharArray();

        for(char x : str.toCharArray()) {
            if(Character.isUpperCase(x)) {
                result += Character.toLowerCase(x);
            } else {
                result += Character.toUpperCase(x);
            }
        }

        return result;
    }

    // Character.isUpperCase
    // 대문자인지 확인

    // toLowerCase
    // Character.toLowerCase의 차이?

    // 대문자: 아스키넘버 65 ~ 90
    // 소문자: 아스키넘버 97 ~ 122
    // 소문자에서 -32, 대문자에서 +32 하면 서로 변환 가능

//    if(x>=65 && x<=90) {
//    	result += (char)(x+32);
//    } else { result += (char)(x-32); }

}