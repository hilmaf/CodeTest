import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine())+2;

        int[][] numArr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 || j==0 || i==n-1 || j==n-1) {
                    numArr[i][j] = 0;
                    continue;
                }

                numArr[i][j] = sc.nextInt();

            }
        }


        int peak = 0;
        for (int i = 1; i < n-1; i++) {
            for (int j = 1; j < n-1; j++) {
                if(numArr[i][j]<=numArr[i-1][j]
                    || numArr[i][j] <= numArr[i][j-1]
                    || numArr[i][j] <= numArr[i+1][j]
                    || numArr[i][j] <= numArr[i][j+1]) {
                    continue;
                }
                peak++;
            }
        }

        System.out.println(peak);

    }
}