import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 1;
        answer = solution(N, answer);

        System.out.println(answer);
    }

    private static int solution(int n, int answer) {
        if (n == 1) {
            return answer;
        } else {
            answer = answer * n;
            n--;
            return solution(n, answer);
        }

    }
}