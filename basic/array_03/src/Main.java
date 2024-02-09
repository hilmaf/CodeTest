import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String N_ = sc.nextLine();
        int N = Integer.parseInt(N_);

        // A의 가위바위보
        int[] rspA = new int[N];
        for (int i = 0; i < N; i++) {
            rspA[i] = sc.nextInt();
        }

        // B의 가위바위보
        int[] rspB = new int[N];
        for (int i = 0; i < N; i++) {
            rspB[i] = sc.nextInt();
        }

        Main m = new Main();
        String[] results= m.solution(N, rspA, rspB);

        for(String x : results) {
            System.out.println(x);
        }

    }

    private String[] solution(int N, int[] rspA, int[] rspB) {
        String[] results = new String[N];
        for (int i = 0; i < N; i++) {
            switch(rspA[i] - rspB[i]) {
                case -2 :
                case 1 : results[i] = "A"; break;
                case 2 :
                case -1 : results[i] = "B"; break;
                case 0 : results[i] = "D"; break;
            }
        }

        return results;

    }
}