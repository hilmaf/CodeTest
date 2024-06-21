import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] chess = new char[N][M];

        // 2차원 배열 구성하기
        for(int i = 0; i < N; i++) {
            char[] line = br.readLine().toCharArray();

            for(int j = 0; j < M; j++) {
                chess[i][j] = line[j];
            }
        }

        // 체스판 자르기
        int minRecolored = Integer.MAX_VALUE;
        for (int i = 0; i <= N-8; i++) {
            for (int j = 0; j <= M-8; j++) {
                // W로 시작하는 경우와 B로 시작하는 경우를 모두 고려
                int recoloredW = cntRecoloring(chess, i, j, 'W');
                int recoloredB = cntRecoloring(chess, i, j, 'B');
                int recolored = Math.min(recoloredW, recoloredB);

                minRecolored = Math.min(minRecolored, recolored);
            }
        }

        System.out.println(minRecolored);

    } //main

    public static int cntRecoloring(char[][] chess, int startRow, int startCol, char start) {
        int count = 0;
        char currentColor = start;

        for (int i = startRow; i < startRow + 8; i++) {
            for (int j = startCol; j < startCol + 8; j++) {
                if (chess[i][j] != currentColor) {
                    count++;
                }
                // 다음 칸 색상 변경 (B <-> W)
                currentColor = (currentColor == 'W') ? 'B' : 'W';
            }
            // 다음 행의 시작 색상 변경 (짝수 행은 동일, 홀수 행은 반대)
            currentColor = (currentColor == 'W') ? 'B' : 'W';
        }

        return count;
    } //cntRecoloring
} //Main