import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] numArr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numArr[i][j] = sc.nextInt();
            }
        }

        // 최대값? 일단 MIN_VALUE 준비
        int answer = Integer.MIN_VALUE;
        int vertical; // 수직 합
        int horizontal; // 수평 합

        for (int i = 0; i < n; i++) {
            vertical = horizontal = 0;
            for (int j = 0; j < n; j++) {
                horizontal += numArr[i][j];
                vertical += numArr[j][i];
            }

            answer = Math.max(answer, horizontal);
            answer = Math.max(answer, vertical);
        }

        int leftDiagonal; // 왼쪽 대각선 합
        int rightDiagonal; // 오른쪽 대각선 합
        leftDiagonal = rightDiagonal = 0;
        for (int i = 0; i < n; i++) {
            leftDiagonal += numArr[i][i];
            rightDiagonal += numArr[n-1-i][n-1-i];
        }

        answer = Math.max(answer, leftDiagonal);
        answer = Math.max(answer, rightDiagonal);


        System.out.println(answer);
    }
}