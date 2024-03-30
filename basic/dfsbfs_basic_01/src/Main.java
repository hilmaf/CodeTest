import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Main m = new Main();
        solution(N, 1);

    }

    private static void solution(int N, int num) {
        if (num > N) {
            return;
        }
        System.out.print(num + " ");
        num++;
        solution(N, num);
    }


}