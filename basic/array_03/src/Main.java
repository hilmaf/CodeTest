import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String N_ = sc.nextLine();
        int N = Integer.parseInt(N_);

        int[] rspA = new int[N];
        for (int i = 0; i < N; i++) {
            rspA[i] = sc.nextInt();
        }

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
            if(rspA[i] == 3 && rspB[i] == 1) {
                results[i] = "B";
            } else if(rspA[i] == 1 && rspB[i] == 3) {
                results[i] = "A";
            } else if(rspA[i] > rspB[i]) {
                results[i] = "A";
            } else if(rspA[i] < rspB[i]) {
                results[i] = "B";
            } else {
                results[i] = "D";
            }
        }

        return results;

    }
}