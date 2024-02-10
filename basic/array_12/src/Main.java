import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 학생 수
        int m = sc.nextInt(); // 시험 수

        int[][] arrArr = new int[n+1][m+1];
        for (int i = 1; i <= m; i++) { // 시험
            for (int j = 1; j <= n; j++) { // 등수
                int student = sc.nextInt();
                arrArr[student][i] = j;
            }
        }

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                boolean ok = true;
                for (int k = 1; k <= m; k++) { // 테스트
                    if(arrArr[i][k] >= arrArr[j][k]) {
                        ok = false;
                        break;
                    }
                }
                if(ok) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}