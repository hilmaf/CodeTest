import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        // 값 입력받기
        int[][] classes = new int[n+1][6];
        for (int i = 1; i <= n; i++) { // 학생
            for (int j = 1; j <= 5; j++) { // 학년
                classes[i][j] = sc.nextInt();
            }
        }

        // 같은 반인 학생 수(자기자신 포함) 표시하는 2차원 배열
        int[][] same = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    same[i][j] = 0;
                    if(classes[i][k] == classes[j][k]) {
                        same[i][j]=1;
                        break; // 중복 피하기
                    }
                }
            }
        }

        int max = Integer.MIN_VALUE;
        int answer=0;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                    cnt+=same[i][j];
            }

            if(cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        System.out.println(answer);

    }
}
