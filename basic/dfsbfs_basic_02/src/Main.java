import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder builder = new StringBuilder();
        solution(N, builder);
        System.out.println(builder.reverse());
    }

    private static StringBuilder solution(int N, StringBuilder answer) {
        if (N / 2 == 1) {
            answer.append(N%2);
            answer.append(N/2);
            return answer;
        } else {
            answer.append(N%2);
            N = N/2;
            solution(N, answer);
            return answer;
        }
    }
}