import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int boardSize = sc.nextInt();
        int[][] board = new int[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int movesSize = sc.nextInt();
        int[] moves = new int[movesSize];
        for (int i = 0; i < movesSize; i++) {
            moves[i] = sc.nextInt();
        }

        //////////////////////////////////////////

        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int i = 0; i < movesSize; i++) {
            int j = 0;

            while(board[j][moves[i]-1]==0) {
                if (j == boardSize-1) {
                    break;
                }
                j++;
            }

            if(!stack.isEmpty() && stack.peek() == board[j][moves[i]-1]) {
                board[j][moves[i]-1] = 0;
                stack.pop();
                answer += 2;
            } else {
                stack.push(board[j][moves[i]-1]);
                board[j][moves[i]-1] = 0;
            }
        }

        System.out.println(answer);

    }
}