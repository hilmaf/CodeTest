import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int[][] classes = new int[n+1][6];
        for (int i = 1; i <= n; i++) { // 행
            for (int j = 1; j <= 5; j++) { // 열
                classes[i][j] = sc.nextInt();

            }
        }

        int max = Integer.MIN_VALUE;
        int answer = 0;

        for (int i = 1; i <= n; i++) { // 학생
            int cnt=0;
            for (int j = 1; j <= n; j++) { // 비교학생
                for (int k = 1; k <= 5; k++) { // 학년
                    if(classes[i][k] == classes[j][k]) {
                        cnt++;
                        break;
                    }

                }
            }

            if(cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        System.out.println(answer);

    }
}