import java.util.Scanner;

public class Main {

    // 문제3 (최대값 구하는 알고리즘 사용)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Main m = new Main();
        String result = m.solution(str);
    }

    public String solution(String str) {

        int m = Integer.MIN_VALUE;

        String[] strArr = str.split(" ");

        // 최대값 구하는 알고리즘
        String result = null;
        for(String x : strArr) {
            if(x.length()> m) {
                m = x.length();
                result = x;
            }
        }

        return result;
    }

}


//Integer.MIN_VALUE : 최대값으로 갱신하기 위해 맨 처음엔 최소값을 저장해야한다.
//split() : 띄어쓰기를 기준으로 분리해서 String 배열을 반환하는 메소드 사용)str.split()
//최대값 구하는 알고리즘 기억하기
//indexOf()
//정수 변수 pos?
//int m = Integer.MIN_VALUE, pos; 코드 분석
